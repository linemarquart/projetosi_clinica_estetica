import styled from "styled-components";

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100vh;
`;

export const Logo = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;

  h1 {
    font-size: 45px;
    color: #3e3c3c;
  }
`;

export const Buttons = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;

  margin-top: 50px;
  width: 100%;

  a {
    width: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
  }

  button {
    width: 100%;
    max-width: 400px;
    height: 60px;
    margin-top: 15px;

    border: none;
    border-radius: 5px;
    font-size: 18px;
    font-weight: 600;

    transition: 0.3s ease-out;
  }

  .clinica {
    background: var(--primary-color);
    color: #ffe4e8;

    &:hover {
      background: #EA7191;
    }
  }

  .admin {
    background: #f3cbcf;
    color: var(--primary-color);

    &:hover {
      background: #ecbdc2;
    }
  }
`;
