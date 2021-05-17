import { createGlobalStyle } from "styled-components";

export default createGlobalStyle`
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    outline: 0;
  }

  :root {
    --primary-color: #E64470;

    --color-rose-01: #F486A4;
    --color-rose-02: #E9517B;
    --color-rose-03: #DC3563;

    --color-white: #fff;

    --text-color-primary: #424041;
    --text-color-secondary: #b2b2b2;
  }

  body {
    background: #EDEDED;
    -webkit-font-smoothing: antialised;
  }

  body, input, button {
    font-family: 'Source Sans Pro', sans-serif;
    font-size: 16px;
  }
  
  button {
    cursor: pointer;
  }

  a {
    text-decoration: none;
  }
`;
