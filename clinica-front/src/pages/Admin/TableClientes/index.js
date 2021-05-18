import { Wrapper, Container } from "./styles";

import Sidebar from "../../../components/Sidebar";

import { FiTrash } from 'react-icons/fi';

export default function TableClientes() {

  /**
   * remover(e, id) {
    e.preventDefault();
    fetch(`http://localhost:3101/log/${id}`)
      .then(obj => obj.json())
      .then(
        (json) => {
          if (json.erro) {
            this.setState({
              erro: false,
              mensagem: json.erro
            })
          }
          else {
            this.componentDidMount()
          }
        }
      )
  }
   */
  
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
              <td className="delete"><FiTrash/></td>
            </tr>

            <tr>
              <td>Chave anonamizada</td>
              <td>Chave anonamizada</td>
              <td>3</td>
              <td><FiTrash/></td>
            </tr>

            <tr>
              <td>Chave anonamizada</td>
              <td>Chave anonamizada</td>
              <td>2</td>
              <td><FiTrash/></td>
            </tr>
          </tbody>
        </table>
      </Container>
    </Wrapper>
  );
}
