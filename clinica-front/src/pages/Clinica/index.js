import React from "react";

import { Link } from "react-router-dom";

import {
  Wrapper,
  Container,
  Top,
  Footer,
  Logo,
  Menu,
  NavLink,
  Admin,
  Logout,
  Dash,
} from "./styles";

import { FiLogOut, FiUser, FiFileText } from "react-icons/fi";
import Dashboard from "../../components/Dashboard";

export default function Clinica() {
  return (
    <Wrapper>
      <Container>
        <Top>
          <Logo>
            Clínica.
          </Logo>

          <Menu>
            <NavLink>
              <FiUser size="18px" />
              <Link to="/cliente">Cadastrar Cliente</Link>
            </NavLink>

            <NavLink>
              <FiFileText size="18px" />
              <Link to="/consulta">Cadastrar Consulta</Link>
            </NavLink>
          </Menu>
        </Top>

        <Footer>
          <Admin>
            <div>
              <span>A</span>
            </div>
            <Link to="/admin">Entrar como admin</Link>
          </Admin>

          <hr color="#E26386" size="1px" />

          <Logout>
            <span>Clinica.</span>
            <div className="logout">
              <FiLogOut size="17px" />
              <Link to="/">Sair</Link>
            </div>
          </Logout>
        </Footer>
      </Container>
      <Dash>
          <h1>Dashboard.</h1>
          <Dashboard />
      </Dash>
    </Wrapper>
  );
}
