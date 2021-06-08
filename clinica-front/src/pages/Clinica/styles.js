import styled from "styled-components";

export const Wrapper = styled.div`
    display: flex;
`;

export const Container = styled.div`
  background: var(--primary-color);
  width: 100%;
  max-width: 280px;
  height: 100vh;

  display: flex;
  flex-direction: column;
  justify-content: space-between;

  padding: 2rem 2rem 2rem 2rem;

  border-top-right-radius: 6px;
  border-bottom-right-radius: 6px;
`;

export const Top = styled.div``;

export const Footer = styled.div`
  hr {
    margin-bottom: 2rem;
    border: none;
    height: 1px;
  }
`;

export const Logo = styled.h1`
  color: var(--color-white);
  font-weight: bold;
`;

export const Menu = styled.div`
  margin-top: 2.55rem;
  color: #ffaec4;
`;

export const NavLink = styled.div`
  margin-top: 0.7rem;
  a {
    font-size: 18px;
    margin-left: 10px;
    color: #ffaec4;

    transition: 0.3s ease-in;

    &:hover {
      color: var(--color-white);
    }
  }
`;

export const Admin = styled.div`
  margin-bottom: 2rem;
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;

  div {
    background: var(--color-white);
    width: 50px;
    height: 50px;
    border-radius: 100%;

    display: flex;
    justify-content: center;
    align-items: center;

    span {
      font-weight: bold;
      color: var(--primary-color);
      font-size: 20px;
    }
  }

  a {
    margin-right: 1rem;
    padding-bottom: 5px;

    color: #ffaec4;

    border-bottom: 1px solid #e26386;

    transition: 0.3s ease-in;

    &:hover {
      color: var(--color-white);
      border-bottom: 1px solid #fff;
    }
  }
`;

export const Logout = styled.div`
  display: flex;
  justify-content: space-between;
  align-items: center;
  color: var(--color-white);

  span {
    font-weight: bold;
  }

  .logout {
    transition: 0.3s ease-in;
    svg {
      margin-right: 5px;

      cursor: pointer;
    }

    a {
      font-size: 18px;
      color: var(--color-white);

      &:hover {
        color: #e6e5e6;
      }
    }
  }
`;

export const Dash = styled.div`
    padding: 2rem 2rem 1rem 2rem;
    width: 100%;

    h1 {
      color: var(--text-color-primary);
    }
`;