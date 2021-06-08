import { BrowserRouter, Switch, Route } from "react-router-dom";

import Home from "../pages/Home";
import Admin from "../pages/Admin";
import Clinica from '../pages/Clinica';

import CadClientes from "../pages/Clinica/CadClientes";
import CadConsulta from '../pages/Clinica/CadConsulta';
import CadProfissional from '../pages/Admin/CadProfissional';
import CadEquipamentos from '../pages/Admin/CadEquipamentos';

import TableClientes from '../pages/Admin/TableClientes';
import Atendimento from '../pages/Admin/Atendimento';
import Logs from '../pages/Admin/Logs';

import DashAdmin from "../pages/Admin/DashAdmin";

export default function Routes() {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact component={Home} />
        <Route path="/admin" exact component={Admin} />
        <Route path="/clinica" exact component={Clinica} />

        <Route path="/cliente" exact component={CadClientes} />
        <Route path="/consulta" exact component={CadConsulta} />
        <Route path="/profissional" exact component={CadProfissional} />
        <Route path="/equipamentos" exact component={CadEquipamentos} />

        <Route path="/relatorio" exact component={TableClientes} />
        <Route path="/atendimento/:id" exact component={Atendimento} />
        <Route path="/logs" exact component={Logs} />

        <Route path="/dashAdmin" exact component={DashAdmin} />
      </Switch>
    </BrowserRouter>
  );
}
