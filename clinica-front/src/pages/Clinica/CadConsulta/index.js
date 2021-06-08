import { Container, Background, Content } from "./styles";
import { Link } from "react-router-dom";
import { useState, useEffect } from "react";
import { Select } from "antd";
import "react-toastify/dist/ReactToastify.css";
import { ToastContainer, toast } from "react-toastify";
import InputMask from 'react-input-mask';
import { api } from "../../../services/api";

export default function CadConsulta() {
  const [listaCliente, setListaCliente] = useState([]);
  const [listaProfissionais, setListaProfissionais] = useState([]);
  const [listaEquipamentos, setListaEquipamentos] = useState([]);
  const [listaServicos, setListaServicos] = useState([]);
  const [cliente, setIdCliente] = useState("");
  const [valor, setValor] = useState("");
  const [data, setData] = useState("");
  const [servicosOferecido, setIdServicos] = useState("");
  const [equipamento, setIdEquipamento] = useState("");
  const [profissional, setProfissional] = useState("");
  const [ValorServicos, setValorServicos] = useState("");
  const [flag, setFlag] = useState(false);


  useEffect(() => {
    async function loadConsulta() {
      const listClient = await api.get('/cliente/buscarClienteToList');
      const { data } = listClient;
      setListaCliente(data);

      const listService = await api.get('/servicos_oferecidos/buscarServicosToList');
      setListaServicos(listService.data);

      const listEquips = await api.get('/equipamento/buscarEquipamentoToList');
      setListaEquipamentos(listEquips.data);

      const listaProf = await api.get('/profissionais/buscarProfissionaisToList');
      setListaProfissionais(listaProf.data);
    }

    loadConsulta();
  }, []);


  async function handleSubmit(e) {
    e.preventDefault();
    await api.post("/atendimento/cadastrar", {cliente,data,equipamento,servicosOferecido,valor,profissional});

    toast.success("Consulta cadastrada com sucesso!");
  }

  const { Option } = Select;

  function onChangeClient(value) {
    setIdCliente(value)
  }
  
  function onChangeService(id, value) {
    setIdServicos(value.name)
    setValorServicos(value.value)

    if (value.children === "Bronzeamento de maquina rosa" || value.children === "Bronzeamento de maquina vermelha ") {
      setFlag(true)
    } else {
      setFlag(false)
      setValor(value.value)
    }
  }

  function onChangeTime(value) {

    setValor(value * ValorServicos)
  }

  function onChangeEquips(value) {
    setIdEquipamento(value)
  }

  function onChangeProfis(value) {
    setProfissional(value )
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
            onChange={onChangeClient}

          >
            {
              listaCliente.map((item) =>
                <Option value={item.id_cliente}>{item.nomeCliente}</Option>
              )
            }

          </Select>
          <InputMask
            mask="99/99/9999"
            type="text"
            name="data"
            placeholder="Data"
            value={data}
            onChange={(e) => setData(e.target.value)}
          />

          <p>Serviço</p>
          <Select
            showSearch
            placeholder="Selecionar Serviço"
            optionFilterProp="children"
            onChange={onChangeService}
          >
            {
              listaServicos.map((item) =>
                <Option value={item.valor} name={item.id_servicos_oferecidos}>{item.nomeServicos}</Option>
              )
            }

          </Select>
          {flag &&
            <Select
              showSearch
              placeholder="Selecionar Tempo"
              optionFilterProp="children"
              onChange={onChangeTime}
            >
              <Option value={20}>20 minutos</Option>
              <Option value={40}>40 minutos</Option>
              <Option value={60}>60 minutos</Option>
            </Select>
          }


          <input type="text" name="valor" placeholder="Valor" value={valor} onChange={(e) => setValor(e.target.value)} />

          <Select
            showSearch
            placeholder="Selecionar equipamento"
            optionFilterProp="children"
            onChange={onChangeEquips}
          >
            {
              listaEquipamentos.map((item) =>
                <Option value={item.id_equipamento}>{item.nomeEquipamento}</Option>
              )
            }
          </Select>

          <Select
            showSearch
            placeholder="Selecionar profissional"
            optionFilterProp="children"
            onChange={onChangeProfis}
          >
            {
              listaProfissionais.map((item) =>
                <Option value={item.id_profissional}>{item.especialidade}</Option>
              )
            }
          </Select>

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
