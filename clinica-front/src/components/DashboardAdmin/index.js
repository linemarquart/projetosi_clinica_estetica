import React from "react";

import { Container, Box, Relatorio } from "./styles";
import Img_Profissionais from "../../assets/Profissionais.svg";
import Img_Equipamentos from "../../assets/Equipamentos.svg";

import { FiArrowRight } from "react-icons/fi";
import { Link } from "react-router-dom";

export default function DashboardAdmin() {
  return (
    <Container>
      <Box>
        <img src={Img_Profissionais} alt="Img Profissionais" width="220px" />
        <div>
          <p>Profissionais</p>
          <Link to="/profissional">
            <h2>Cadastrar Profissionais</h2>
            <FiArrowRight size="30px" />
          </Link>
        </div>
      </Box>

      <Box>
        <img src={Img_Equipamentos} alt="Img Equipamentos" width="220px" />
        <div>
          <p>Equipamentos</p>
          <Link to="/equipamentos">
            <h2>Cadastrar Equipamentos</h2>
            <FiArrowRight size="30px" />
          </Link>
        </div>
      </Box>

      <Relatorio>
        <Link to="/relatorio">
          <h2>Ver Relatórios</h2>
          <FiArrowRight size="30px" />
        </Link>
      </Relatorio>
    </Container>
  );
}
