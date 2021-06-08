import React, { useState, useEffect } from 'react';

import { Wrapper, Container, ContainerLogs } from './styles';
import Sidebar from '../../../components/Sidebar';
import { FiArrowLeft } from 'react-icons/fi';
import { api } from '../../../services/api';

export default function Logs() {
    const [logs, setLogs] = useState([]);

    useEffect(() => {
        async function loadLogs() {
            const response = await api.get('/relatorios/buscarRelatoriosToList');
            const { data } = response;
            setLogs(data);
        }

        loadLogs();
    }, []);


    return (
        <Wrapper>
            <Sidebar />
            <Container>
                <a href="/dashAdmin"><FiArrowLeft fontSize="18px" color="gray" /></a>
                <h1>Logs</h1>

                <ContainerLogs>
                    <div className="header-logs">
                        <h3>Log</h3>
                        <h3>01</h3>
                    </div>
                    <div className="info-logs">
                        <h3>ID Relatório: <b>09</b></h3>
                        <h3>Logs: <b>Insert</b></h3>
                        <h3>Data: <b>07/06/2021 - 20:40:12</b></h3>
                        <h3>Dados Cliente: <b>Seila mano</b></h3>
                    </div>
                </ContainerLogs>
            </Container>
        </Wrapper>
    );
}

