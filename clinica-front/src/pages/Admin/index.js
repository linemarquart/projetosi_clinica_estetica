import React, { useState } from 'react';

import { Container, Logo, Form } from "./styles";

import { useHistory } from 'react-router-dom';

import AdminImg from "../../assets/Admin.png";

export default function Admin() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const [error, setError] = useState('');

  const history = useHistory();

  function handleSubmit(e) {
    e.preventDefault();
    const data = ({
        email,
        password
    });

    if(email === 'admin@gmail.com' && password === 'admin123') {
        history.push('/dashAdmin');
    } else {
        history.push('/admin');
        setEmail('');
        setPassword('');

        setError('Credenciais inválidas');
    }

    console.log(data);
  }

  return (
    <Container>
      <Logo>
        <img src={AdminImg} alt="Admin" width="300px" />
        <h1>Login Admin</h1>
      </Logo>

      <Form onSubmit={handleSubmit}>
        <input
          type="email"
          name="email"
          placeholder="Digite o e-mail"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
        <input
          type="password"
          name="password"
          placeholder="Digite a senha"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <p>{error}</p>
        <button type="submit">Entrar</button>
      </Form>
    </Container>
  );
}
