import { Container, Background, Content } from "./styles";
import { Link } from "react-router-dom";
import { useState } from "react";

import { api } from '../../../services/api';

import 'react-toastify/dist/ReactToastify.css';
import { ToastContainer, toast } from 'react-toastify';

export default function CadProfissional() {
  const [especialidade, setEspecialidade] = useState("");

  async function handleSubmit(e) {
    e.preventDefault();

    await api.post("/profissionais/cadastrar", { especialidade });

    setEspecialidade('');
    toast.success("Profissional cadastrado com sucesso!");
  }

  return (
    <Container>
      <Background />

      <ToastContainer />
      <Content onSubmit={handleSubmit}>
        <form>
          <h1>Cadastro de Profissional</h1>

          <input
            type="text"
            name="especialidade"
            placeholder="Especialidade"
            value={especialidade}
            onChange={(e) => setEspecialidade(e.target.value)}
          />

          <button type="submit">Cadastrar Especialidade</button>
          <Link to="/dashAdmin">Voltar</Link>
        </form>
      </Content>
    </Container>
  );
}
