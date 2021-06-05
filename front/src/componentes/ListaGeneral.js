import React, { useContext } from "react";
import { Store, HOST_API } from "../App";
import { Form } from "./Form";
import { List } from "./List";

export const ListaGeneral = () => {
  const {
    dispatch,
    state: { listGeneral },
  } = useContext(Store);

  return (
    <div>
      {console.log(listGeneral)}
      {listGeneral.map((list, i) => {
        return (
          <div key={i}>
            <h2>{list.nombre}</h2>
            <Form />
            <List />
          </div>
        );
      })}
    </div>
  );
};
