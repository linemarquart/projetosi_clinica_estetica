import { Container, Background, Content } from "./styles";
import { Link } from "react-router-dom";

import { useState } from "react";
import { api } from "../../../services/api";

import 'react-toastify/dist/ReactToastify.css';
import { ToastContainer, toast } from 'react-toastify';

import InputMask from 'react-input-mask';

export default function Clinica() {
  const [nomeCliente, setNomeCliente] = useState("");
  const [cpf, setCpf] = useState("");
  const [endereco, setEndereco] = useState("");

  async function handleSubmit(e) {
    e.preventDefault();
    await api.post("/cliente/cadastrar", { nomeCliente, cpf, endereco });

    setNomeCliente('');
    setCpf('');
    setEndereco('');

    toast.success("Cliente cadastrado com sucesso!");
  }
  return (
    <Container>
      <Background>
        <Link to="clinica">
          <h3>Voltar</h3>
        </Link>
      </Background>

      <ToastContainer />
      <Content>
        <form onSubmit={handleSubmit}>
          <h1>Cadastro de Clientes</h1>

          <input
            type="text"
            name="nomeCliente"
            placeholder="Nome Completo"
            value={nomeCliente}
            onChange={(e) => setNomeCliente(e.target.value)}
          />
          <InputMask
            mask="999.999.999-99"
            type="text"
            name="cpf"
            placeholder="CPF"
            value={cpf}
            onChange={(e) => setCpf(e.target.value)}
          />

          <p>Endereço</p>
          <input
            type="text"
            name="rua"
            placeholder="Digite o endereço"
            value={endereco}
            onChange={(e) => setEndereco(e.target.value)}
          />

          <button type="submit">Cadastrar Cliente</button>
          <Link to="/consulta">Cadastrar Consulta</Link>
        </form>
      </Content>
    </Container>
  );
}
