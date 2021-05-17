import styled from "styled-components";

export const Container = styled.div`
  display: flex;
  flex-flow: wrap;
  justify-content: space-between;

  margin-top: 2rem;
`;

export const ContainerBox = styled.div`
  background: var(--color-white);
  width: 300px;

  padding: 2rem;
  border-radius: 10px;

  p {
    margin-top: 15px;
    color: var(--text-color-secondary);
  }

  h2 {
    color: var(--text-color-primary);
  }
`;

export const TotalClientes = styled.div`
  .icon {
    background: var(--color-rose-01);
    width: 60px;
    height: 50px;
    border-radius: 5px;

    display: flex;
    align-items: center;
    justify-content: center;

    svg {
      color: var(--color-white);
    }
  }
`;

export const TotalConsultas = styled.div`
.icon {
    background: var(--color-rose-02);
    width: 60px;
    height: 50px;
    border-radius: 5px;

    display: flex;
    align-items: center;
    justify-content: center;

    svg {
      color: var(--color-white);
    }
  }
`;

export const TotalProfissionais = styled.div`
    .icon {
    background: var(--color-rose-03);
    width: 60px;
    height: 50px;
    border-radius: 5px;

    display: flex;
    align-items: center;
    justify-content: center;

    svg {
      color: var(--color-white);
    }
  }
`;
