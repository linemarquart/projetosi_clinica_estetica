import React from "react";

import {
  Container,
  ContainerBox,
  TotalClientes,
  TotalConsultas,
  TotalProfissionais,
} from "./styles";
import { FiUser, FiFileText } from "react-icons/fi";

function Dashboard() {
  return (
    <Container>
      <TotalClientes>
        <ContainerBox>
          <div className="icon">
            <FiUser size="25px" />
          </div>
          <p>Total</p>
          <h2>100 Clientes</h2>
        </ContainerBox>
      </TotalClientes>

      <TotalConsultas>
        <ContainerBox>
          <div className="icon">
            <FiFileText size="25px" />
          </div>
          <p>Total</p>
          <h2>100 Consultas</h2>
        </ContainerBox>
      </TotalConsultas>

      <TotalProfissionais>
        <ContainerBox>
          <div className="icon">
            <FiUser size="25px" />
          </div>
          <p>Total</p>
          <h2>20 Profissionais</h2>
        </ContainerBox>
      </TotalProfissionais>
    </Container>
  );
}

export default Dashboard;
