import React from "react";
import { Store, HOST_API } from "../App";
import { Form } from "./Form";
import { List } from "./List";

export const ListaGeneral = () => {
  return (
    <div>
      <h2>----</h2>
      <Form />
      <List />
    </div>
  );
};
