import React, { useRef, useState, useContext } from "react";
import Store from "./Store";

const HOST_API ="http://localhost:8080/api";

const Grouplist = () => {
    const formRef = useRef(null);

    const {
     dispatch,
     state: { todo },
     } = useContext(Store);
    const item = todo.item;
    const [state, setState] = useState(item);    

    const onAdd = (event) => {
    event.preventDefault();

    const request = {
      namegroup: state.namegroup,
      idgroup: null,
    };

    fetch(HOST_API + "/grouptodo/save", {
      method: "POST",
      body: JSON.stringify(request),
      headers: {
        "Content-Type": "application/json",
      },
    })
      .then((response) => response.json())
      .then((todo) => {
        dispatch({ type: "add-grouplist", item: todo });
        setState({ name: "" });
        formRef.current.reset();
      });
  };

    return(
    <form>
      <input
        type="text"
        name="name"
        placeholder="Genera la lista Principal"
       ></input>
      <button onClick={onAdd}>Nueva Lista</button>
    </form>
    )
}

export default Grouplist;