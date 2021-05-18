import { Wrapper, Container } from "./styles";

import Sidebar from "../../../components/Sidebar";
import { useState, useEffect } from "react";
import { api } from "../../../services/api";

import { FiTrash } from 'react-icons/fi';

export default function TableClientes() {
  const [lista, setLista] = useState([]);

  useEffect(() => {
    async function loadConsulta() {
      const response = await api.get('/cliente/buscarClienteToList');
      const { data } = response;
      setLista(data);
    }

    loadConsulta();
  }, []);

  async function deleteUser(id) {
    await api.delete(`/cliente/excluir/${id}`)
    window.location.reload();
  }

  return (
    <Wrapper>
      <Sidebar />
      <Container>
        <h1>Relatórios.</h1>
        <table>
          <thead>
            <tr>
              <th>Nome</th>
              <th>CPF</th>
              <th>Serviços Usados</th>
            </tr>
          </thead>
          <tbody>
            {
              lista.map((item) =>
                <tr>
                  <td>{item.nomeCliente}</td>
                  <td>{item.cpf}</td>
                  <td>{item.atendimento}</td>
                  <td className="delete"><FiTrash onClick={() => deleteUser(item.id_cliente)} /></td>
                </tr>
              )
            }
          </tbody>
        </table>
      </Container>
    </Wrapper>
  );
}