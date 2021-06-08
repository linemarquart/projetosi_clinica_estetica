import styled from 'styled-components';

export const Wrapper = styled.div`
  display: flex;
  width: 100%;
`;

export const Container = styled.div`
  padding: 2rem 2rem 1rem 2rem;
`;

export const ContainerLogs = styled.div`
  background: var(--color-white);
  width: 500px;
  margin-top: 15px;
  border-radius: 3px;

  .header-logs {
        display: flex;
        border-radius: 3px;
        padding: 10px;
        justify-content: space-between;
        align-items: center;
        background: var(--primary-color);
        color: var(--color-white);

        h3 {
         font-weight: bold;
         color: var(--color-white);
        }
    }

    .info-logs {
        padding: 20px;
        
        h3 {
            color: #5D5D5D;
        }
    }
`;
