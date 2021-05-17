import { Container, Background, Content } from "./styles";
import { Link } from "react-router-dom";

export default function CadProfissional() {
  return (
    <Container>
      <Background />
      <Content>
        <form>
          <h1>Cadastro de Equipamentos</h1>

          <input type="text" name="equipamento" placeholder="Nome do Equipamento" />

          <button type="submit">Cadastrar Equipamento</button>
          <Link to="/dashAdmin">Voltar</Link>
        </form>
      </Content>
    </Container>
  );
}