import { Container, Background, Content,Col,Row } from "./styles";
import { Link } from "react-router-dom";

import { FiArrowLeft } from "react-icons/fi";

export default function CadConsulta() {
  const [lista, setLista] = useState("");

  async function renderSubmit(e){
    e.preventDefault()
   await api.post("/cliente/cadastrar",{nomeCliente})
  }

 function componentDidMount() {
    fetch("http://localhost:8080/cliente/buscarClienteToList")
      .then(obj => obj.json())
      .then(
        (json) => {
          if (json.erro) {
              Console.log(json.erro)
          }
          else {
                setLista (json.result)
          }
        }
      )
  }
componentDidMount()

  return (
    <Container>
       <div>
              {
                lista.map((item) =>
                  <Col key={} >
                    <Row>{item.nomeCliente}</Row>
                  </Col>
                )
              }
            </div>
      <Content>
        <form>
          <h1>Cadastro de Consulta</h1>
          <input type="text" name="cliente" placeholder="Cliente" />
          <input type="text" name="data" placeholder="Data da Consulta" />

          <p>Serviço</p>
          <input type="text" name="aplicacao" placeholder="Nome da Aplicação" />
          <input type="text" name="valor" placeholder="Valor" />

          <input type="text" name="profissional" placeholder="Profissional" />
          <input type="text" name="tempo" placeholder="Tempo" />

          <input type="text" name="equipamento" placeholder="Equipamento" />

          <button type="submit">Marcar Consulta</button>
          <Link to="/cliente">Cadastrar Cliente</Link>
        </form>
      </Content>
      <Background>
        <Link to="clinica">
          <FiArrowLeft size="20px" />
          <h3>Voltar</h3>
        </Link>
      </Background>
    </Container>
  );
}
