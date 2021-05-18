import { Container, Background, Content } from "./styles";
import { Link } from "react-router-dom";

import { useState } from "react";

import { Select } from "antd";

import "react-toastify/dist/ReactToastify.css";
import { ToastContainer, toast } from "react-toastify";

import { api } from "../../../services/api";

export default function CadConsulta() {
  const [lista, setLista] = useState("");

  const [nomeCliente, setNomeCliente] = useState("");

  async function handleSubmit(e) {
    e.preventDefault();
    await api.post("/cliente/cadastrar", { nomeCliente });

    toast.success("Consulta cadastrada com sucesso!");
  }

  function componentDidMount() {
    fetch("http://localhost:8080/cliente/buscarClienteToList")
      .then((obj) => obj.json())
      .then((json) => {
        if (json.erro) {
          console.log(json.erro);
        } else {
          setLista(json.result);
        }
      });
  }
  componentDidMount();

  const { Option } = Select;

  function onChange(value) {
    console.log(`selected ${value}`);

    setNomeCliente(value);
  }

  function onSearch(val) {
    console.log("search:", val);
  }

  return (
    <Container>
      <ToastContainer />
      <Content>
        <form onSubmit={handleSubmit}>
          <h1>Cadastro de Consulta</h1>
          <Select
            showSearch
            placeholder="Selecionar cliente"
            optionFilterProp="children"
            onChange={onChange}
            onSearch={onSearch}
          >
            <Option value="victoria">Victoria</Option>
            <Option value="gabriel">Gabriel</Option>
          </Select>
          <input type="text" name="data" placeholder="Data da Consulta" />

          <p>Serviço</p>
          <input type="text" name="aplicacao" placeholder="Nome da Aplicação" />
          <input type="text" name="valor" placeholder="Valor" />

          <input type="text" name="profissional" placeholder="Profissional" />
          <input type="text" name="tempo" placeholder="Tempo" />

          <input type="text" name="equipamento" placeholder="Equipamento" />

          <button type="submit">Marcar Consulta</button>
          <Link to="/cliente">Cadastrar Cliente</Link>
        </form>
      </Content>
      <Background>
        <Link to="clinica">
          <h3>Voltar</h3>
        </Link>
      </Background>
    </Container>
  );
}
