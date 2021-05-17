import styled from "styled-components";

export const Container = styled.div`
  margin-top: 2rem;
`;

export const Box = styled.div`
  background: var(--color-white);
  display: flex;
  align-items: center;

  margin-bottom: 1.2rem;
  padding: 1rem;

  max-width: 600px;
  border-radius: 10px;

  h1 {
    font-size: 28px;
  }

  p {
    color: var(--text-color-secondary);
  }

  svg {
    margin-top: 3rem;
    color: var(--primary-color);
  }
`;

export const Relatorio = styled.div`
  background: var(--primary-color);
  max-width: 600px;
  border-radius: 10px;

  a {
    display: flex;
    justify-content: space-between;
    align-items: center;
    color: var(--color-white);
  }

  padding: 1.55rem;

  h2 {
    color: var(--color-white);
  }
`;
