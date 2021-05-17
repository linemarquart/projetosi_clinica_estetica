import { Wrapper, Container } from "./styles";

import Sidebar from "../../../components/Sidebar";

import DashboardAdmin from "../../../components/DashboardAdmin";

export default function DashAdmin() {
  return (
    <Wrapper>
      <Sidebar />
      <Container>
        <h1>Dashboard.</h1>
        <DashboardAdmin />
      </Container>
    </Wrapper>
  );
}
