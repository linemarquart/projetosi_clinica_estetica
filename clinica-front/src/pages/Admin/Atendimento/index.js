import React from 'react';

import { Wrapper, Container, AtendimentoContainer } from './styles';

import { useState, useEffect } from "react";
import { api } from "../../../services/api";
import { useParams } from 'react-router-dom';


import { Divider } from 'antd';

import { FiArrowLeft } from 'react-icons/fi';

import Sidebar from '../../../components/Sidebar';

export default function Atendimento() {
  const [listaAtendimentos, setListaAtendimentos] = useState([]);

  const { id } = useParams();

  useEffect(() => {
    async function loadConsulta() {
      const listAtendimentos = await api.get(`/atendimento/buscarAtendimentoPorCliente/${id}`);
      setListaAtendimentos(listAtendimentos.data);
    }

    loadConsulta();
  }, []);

  return (
    <Wrapper>
      <Sidebar />
      <Container>
        <a href="/relatorio"><FiArrowLeft fontSize="18px" color="gray" /></a>
        <h1>Atendimento 01</h1>

        <AtendimentoContainer>
          {
            listaAtendimentos.map((item, i) =>
              <>
                <div className="header-atendimento">
                  <h3>Atendimento</h3>
                  <h3>{i+1}</h3>
                </div>

                <div className="info">
                  <Divider style={{ color: '#b2b2b2' }}>Cliente</Divider>

                  <div>
                    <h3>ID Cliente: <b>{item.cliente}</b></h3>
                    <h3>Data: <b>{item.data}</b></h3>
                  </div>

                  <Divider style={{ color: '#b2b2b2' }}>Atendimento</Divider>

                  <div>
                    <h3>ID Atendimento: <b>{item.id_atendimento}</b></h3>
                    <h3>ID Profissional: <b>{item.profissional}</b></h3>
                    <h3>ID Valor: <b>R${item.valor},00</b></h3>
                  </div>

                  <Divider style={{ color: '#b2b2b2' }}>Serviço</Divider>

                  <div>
                    <h3>ID Equipamento: <b>{item.equipamento}</b></h3>
                    <h3>ID Serviços Usados: <b>{item.servicosOferecido}</b></h3>
                  </div>
                </div>
              </>
            )
          }



        </AtendimentoContainer>
      </Container>
    </Wrapper>
  );
}
