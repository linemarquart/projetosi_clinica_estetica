import { Container, Background, Content } from "./styles";
import { Link } from "react-router-dom";

export default function CadProfissional() {
  return (
    <Container>
      <Background />
      <Content>
        <form>
          <h1>Cadastro de Profissional</h1>

          <input type="text" name="especialidade" placeholder="Especialidade" />

          <button type="submit">Cadastrar Especialidade</button>
          <Link to="/dashAdmin">Voltar</Link>
        </form>
      </Content>
    </Container>
  );
}
