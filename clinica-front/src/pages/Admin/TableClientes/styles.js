import styled from "styled-components";

export const Wrapper = styled.div`
  display: flex;
  width: 100%;
`;

export const Container = styled.div`
  padding: 2rem 2rem 1rem 2rem;
  width: 100%;

  h1 {
    color: var(--text-color-primary);
  }

  table {
    width: 100%;
    border-spacing: 0 0.5rem;
  }

  th {
    color: black;
    font-weight: 400;
    padding: 1rem 2rem;
    text-align: center;
    line-height: 1.5rem;
  }

  td{
    padding: 1rem 2rem;
    border: 0;
    background: white;
    color: black;
    border-radius: 0.25rem;
    text-align: center;

    &:first-child {
      color: blueviolet;
    }
  }

  .delete {
    cursor: pointer;
  }
`;
