import { Container, Background, Content } from "./styles";
import { Link } from "react-router-dom";

import { FiArrowLeft } from "react-icons/fi";

export default function Clinica() {
  return (
    <Container>
      <Background>
        <Link to="clinica">
          <FiArrowLeft size="20px" />
          <h3>Voltar</h3>{" "}
        </Link>
      </Background>
      <Content>
        <form>
          <h1>Cadastro de Clientes</h1>

          <input type="text" name="nome" placeholder="Nome Completo" />
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
