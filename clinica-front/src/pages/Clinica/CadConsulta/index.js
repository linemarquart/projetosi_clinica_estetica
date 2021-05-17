import { Container, Background, Content } from "./styles";
import { Link } from "react-router-dom";

import { FiArrowLeft } from "react-icons/fi";

export default function CadConsulta() {
  return (
    <Container>
      <Content>
        <form>
          <h1>Cadastro de Consulta</h1>
          <input type="text" name="cliente" placeholder="Cliente" />
          <input type="text" name="data" placeholder="Data da Consulta" />

          <p>Serviço</p>
          <input type="text" name="aplicacao" placeholder="Nome da Aplicação" />
          <input type="text" name="valor" placeholder="Valor" />

          <input type="text" name="profissional" placeholder="Profissional" />
          <input type="text" name="tempo" placeholder="Tempo" />

          <input type="text" name="equipamento" placeholder="Equipamento" />

          <button type="submit">Marcar Consulta</button>
          <Link to="/cliente">Cadastrar Cliente</Link>
        </form>
      </Content>
      <Background>
        <Link to="clinica">
          <FiArrowLeft size="20px" />
          <h3>Voltar</h3>
        </Link>
      </Background>
    </Container>
  );
}
