import { Container, Background, Content } from "./styles";
import { Link } from "react-router-dom";

import { FiArrowLeft } from "react-icons/fi";
import { useState } from "react";
import { api } from "../../../services/api";

export default function Clinica() {
  const [nomeCliente, setNome] = useState("");

  async function renderSubmit(e){
    e.preventDefault()
   await api.post("/cliente/cadastrar",{nomeCliente})
  }
  return (
    <Container>
      <Background>
        <Link to="clinica">
          <FiArrowLeft size="20px" />
          <h3>Voltar</h3>{" "}
        </Link>
      </Background>
      <Content>
        <form onSubmit={renderSubmit}>
          <h1>Cadastro de Clientes</h1>

          <input type="text" name="nomeCliente" placeholder="Nome Completo" value={nomeCliente} onChange={(e) => setNome(e.target.value)}
/>
          <input type="text" name="cpf" placeholder="CPF" />
          <input
            type="text"
            name="data_de_nasc"
            placeholder="Data de Nascimento"
          />

          <p>Endereço</p>
          <input type="text" name="rua" placeholder="Rua/Avenida" />
          <input type="text" name="bairro" placeholder="Bairro" />
          <input type="text" name="estado" placeholder="Estado" />
          <input type="text" name="cidade" placeholder="Cidade" />

          <button type="submit">Cadastrar Cliente</button>
          <Link to="/consulta">Cadastrar Consulta</Link>
        </form>
      </Content>
    </Container>
  );
}
