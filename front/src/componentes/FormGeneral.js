import React, { useRef, useState } from "react";
import { Store, HOST_API } from "../App";
export const FormGeneral = () => {
  const formRef = useRef(null);

  const [state, setState] = useState("");

  const onAdd = (event) => {
    event.preventDefault();

    const request = {
      nombre: state,
    };
    fetch(HOST_API + "/todoListageneral", {
      method: "POST",
      body: JSON.stringify(request),
      headers: {
        "Content-Type": "application/json",
      },
    });
  };

  return (
    <form>
      <input
        type="text"
        name="name"
        placeholder="Lista de TO DO"
        onChange={(event) => {
          setState(event.target.value);
        }}
      ></input>
      <button onClick={onAdd}>Nueva lista</button>
    </form>
  );
};
