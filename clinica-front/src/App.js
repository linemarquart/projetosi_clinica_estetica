import Routes from "./routes/routes";
import GlobalStyle from './styles/global';

import PageProvider from './hooks/useTitle';

export default function App() {
  return (
    <PageProvider>
      <Routes />
      <GlobalStyle />
    </PageProvider>
  );
}
