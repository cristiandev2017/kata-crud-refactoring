import React, { useRef, useState, useContext } from "react";
import Store from "./Store";

const HOST_API = "http://localhost:8080/api";

const GroupForm = () => {
  const formRef = useRef(null);

  const {
    dispatch,
    state: { grouplist },
  } = useContext(Store);
  const item = grouplist.item;
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
      .then((grouplist) => {
        dispatch({ type: "add-grouplist", item: grouplist });
        setState({ namegroup: "" });
        formRef.current.reset();
      });
  };

  return (
    <form ref={formRef}>
      <input
        type="text"
        name="name"
        placeholder="Genera la lista Principal"
        onChange={(event) => {
          setState({ ...state, namegroup: event.target.value });
        }}
        className="form-control"
      ></input>
      <button className="btn btn-primary form-control" onClick={onAdd}>Nueva Lista</button>
    </form>
  );
};

export default GroupForm;
