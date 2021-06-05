import React, { createContext } from "react";
import { Form } from "./componentes/Form";
import { FormGeneral } from "./componentes/FormGeneral";
import { List } from "./componentes/List";
import { StoreProvider } from "./componentes/StoreProvider";
import { ListaGeneral } from "./componentes/ListaGeneral";

export const HOST_API = "http://localhost:8080/api";
export const initialState = {
  todo: { list: [], item: {} },
};
export const Store = createContext(initialState);

function App() {
  return (
    <StoreProvider>
      <FormGeneral />
      <h3>To-Do List</h3>
      <Form />
      <List />
      <ListaGeneral />
    </StoreProvider>
  );
}

export default App;
