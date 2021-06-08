import React from 'react';

import { Wrapper, Container, AtendimentoContainer } from './styles';

import { Divider } from 'antd';

import { FiArrowLeft } from 'react-icons/fi';

import Sidebar from '../../../components/Sidebar';

export default function Atendimento() {
  return (
    <Wrapper>
      <Sidebar />
      <Container>
        <a href="/relatorio"><FiArrowLeft fontSize="18px" color="gray"/></a>
        <h1>Atendimento 01</h1>

        <AtendimentoContainer>
          <div className="header-atendimento">
            <h3>Atendimento</h3>
            <h3>01</h3>
          </div>

          <div className="info">
            <Divider style={{ color: '#b2b2b2' }}>Cliente</Divider>

            <div>
              <h3>ID Cliente: <b>02</b></h3>
              <h3>Data: <b>23/02/2021</b></h3>
            </div>

            <Divider style={{ color: '#b2b2b2' }}>Atendimento</Divider>

            <div>
              <h3>ID Atendimento: <b>01</b></h3>
              <h3>ID Profissional: <b>03</b></h3>
              <h3>ID Valor: <b>R$ 125,00</b></h3>
            </div>

            <Divider style={{ color: '#b2b2b2' }}>Serviço</Divider>

            <div>
              <h3>ID Equipamento: <b>01212</b></h3>
              <h3>ID Serviços Usados: <b>0312121</b></h3>
            </div>
          </div>
        </AtendimentoContainer>
      </Container>
    </Wrapper>
  );
}
