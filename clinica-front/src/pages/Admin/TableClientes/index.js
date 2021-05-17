import { Wrapper, Container } from "./styles";

import Sidebar from "../../../components/Sidebar";

export default function TableClientes() {
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
            <tr>
              <td>Chave anonamizada</td>
              <td>Chave anonamizada</td>
              <td>1</td>
            </tr>

            <tr>
              <td>Chave anonamizada</td>
              <td>Chave anonamizada</td>
              <td>3</td>
            </tr>

            <tr>
              <td>Chave anonamizada</td>
              <td>Chave anonamizada</td>
              <td>2</td>
            </tr>
          </tbody>
        </table>
      </Container>
    </Wrapper>
  );
}
