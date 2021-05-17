import styled from "styled-components";

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: 100vh;
`;

export const Logo = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;

  h1 {
    font-size: 40px;
    color: #3e3c3c;
    margin-top: 5px;
  }
`;

export const Form = styled.form`
  margin-top: 30px;
  display: flex;
  flex-direction: column;
  align-items: center;

  width: 100%;
  max-width: 400px;

  input {
    width: 100%;
    height: 55px;
    margin-top: 10px;

    border-radius: 5px;
    border: 1px solid #ffd1d5;

    padding-left: 10px;

    transition: 0.3s ease-in;

    &:focus {
        border: 1px solid #DFA2A8;
    }

    &:hover {
        border: 1px solid #DFA2A8;
    }
  }

  button {
    width: 100%;
    height: 50px;
    margin-top: 20px;

    border: none;
    border-radius: 5px;

    transition: 0.3s ease-in;

    background: var(--primary-color);
    color: #ffe4e8;

    font-weight: 700;

    &:hover {
      background: #F15982;
    }
  }

  p {
    margin-top: 10px;
    color: #FF253A;
    font-weight: bold;
  }
`;
