import { Container, Background, Content } from "./styles";
import { Link } from "react-router-dom";

import 'react-toastify/dist/ReactToastify.css';
import { ToastContainer, toast } from 'react-toastify';
import { useState } from "react";
import { api } from "../../../services/api";

export default function CadProfissional() {
  const [nomeEquipamento, setEquipamento] = useState("");

  async function handleSubmit(e) {
    e.preventDefault();

    await api.post("/equipamento/cadastrar", { nomeEquipamento });

    setEquipamento("");
    toast.success("Equipamento cadastrado com sucesso!");
  }

  return (
    <Container>
      <Background />

      <ToastContainer />
      <Content>
        <form onSubmit={handleSubmit}>
          <h1>Cadastro de Equipamentos</h1>

          <input
            type="text"
            name="nomeEquipamento"
            placeholder="Nome do Equipamento"
            value={nomeEquipamento}
            onChange={(e) => setEquipamento(e.target.value)}
          />

          <button type="submit">Cadastrar Equipamento</button>
          <Link to="/dashAdmin">Voltar</Link>
        </form>
      </Content>
    </Container>
  );
}
