import styled from "styled-components";

import Img_Profissional from "../../../assets/Profissionais.svg";

export const Container = styled.div`
  height: 100vh;
  display: flex;
  align-items: stretch;
`;

export const Background = styled.div`
  flex: 1;
  background: url(${Img_Profissional}) no-repeat center;
  background-color: #fadce4;
  background-size: contain;

  display: flex;
  justify-content: center;

  a {
    margin-top: 1rem;
    display: flex;
    color: var(--text-color-primary);

    h3 {
      margin-left: 10px;
    }
  }
`;

export const Content = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 100%;
  max-width: 700px;
  background: var(--color-white);

  form {
    width: 420px;
    display: flex;
    flex-direction: column;

    h1 {
      margin-bottom: 1rem;
      color: var(--text-color-primary);
    }

    p {
      margin-top: 1rem;
      color: var(--text-color-secondary);
    }

    input {
      width: 100%;
      padding: 16px;
      margin-top: 10px;

      font-size: 14px;

      border-radius: 5px;
      border: 1px solid #E8E8E8;

      padding-left: 10px;

      transition: 0.1s ease-in;

      &:focus {
        border: 1px solid #EA7191;
      }

      &:hover {
        border: 1px solid #EA7191;
      }
    }
  }

  button {
    width: 100%;
    height: 55px;
    margin-top: 20px;

    border: none;
    border-radius: 5px;

    transition: 0.3s ease-in;

    background: var(--primary-color);
    color: var(--color-white);

    font-weight: 700;

    &:hover {
      background: #F15982;
    }
  }

  a {
    text-align: center;
    padding-top: 10px;
    font-weight: bold;
    color: var(--text-color-primary);
    transition: 0.2s ease-in;

    &:hover {
      color: var(--primary-color);
    }
  }
`;
