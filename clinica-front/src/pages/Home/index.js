import { Container, Logo, Buttons } from "./styles";

import { Link } from "react-router-dom";

import Logo_1 from "../../assets/Logo_1.svg";

export default function Home() {
  return (
    <Container>
      <Logo>
        <img src={Logo_1} alt="Logo" width="80px" />
        <h1>Clinica Estética</h1>
      </Logo>
      <Buttons>
        <Link to="/clinica">
          <button className="clinica">Clinica</button>
        </Link>

        <Link to="/admin">
          <button className="admin">Admin</button>
        </Link>
      </Buttons>
    </Container>
  );
}
