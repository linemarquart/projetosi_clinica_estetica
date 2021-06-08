import {
    Wrapper,
    Container,
    Top,
    Logo,
    Menu,
    NavLink,
    Footer,
    Admin,
    Logout,
  } from "./styles";
  
  import { FiLogOut, FiUser, FiFileText } from "react-icons/fi";
  
  import { Link } from "react-router-dom";
  
  export default function Sidebar() {
    return (
      <Wrapper>
        <Container>
          <Top>
            <Logo>
             Admin
             </Logo>
  
            <Menu>
              <NavLink>
                <FiUser size="18px" />
                <Link to="/profissional">Cadastrar Profissional</Link>
              </NavLink>
  
              <NavLink>
                <FiFileText size="18px" />
                <Link to="/equipamentos">Cadastrar Equipamentos</Link>
              </NavLink>
  
              <NavLink>
                <FiFileText size="18px" />
                <Link to="/relatorio">Relatórios</Link>
              </NavLink>

              <NavLink>
                <FiFileText size="18px" />
                <Link to="/logs">Logs</Link>
              </NavLink>
            </Menu>
          </Top>
  
          <Footer>
            <Admin>
              <div>
                <span>C</span>
              </div>
              <Link to="/">Acessar clínica</Link>
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
      </Wrapper>
    );
  }