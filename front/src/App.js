import React from "react";
import { StoreProvider } from "./components/Store";
import List from "./components/List";
import Form from "./components/Form";
import GroupForm from "./components/GroupForm";

function App() {
  return (
    <StoreProvider>
      <center>
        <h3>RETO  REACT|SPRING-BOOT</h3>
      </center>
      <hr className="borde"></hr>
      <p>
        La siguiente aplicación tiene como objetivo generar unas tareas
        especificas. Inicialmente se tendra un crud en el cual puedes ingresar
        tareas y luego se hara de una forma mas general donde puedes tener un grupo de tareas y puedas gestionarla.
      </p>
      <div className="row">
        <div className="col-4">
          <Form />
          <br></br>
          <div class="alert alert-dark" role="alert">
           En este apartado podrás seleccionar tus tareas preferidas y se visualizarán en la tabla. El procedimiento es dinamico y se maneja un proceso el cual el reflejo de los cambios son casi inexpresivos al usuario final
          </div>
        </div>
        <div className="col-8">
          <List />
        </div>
      </div>
      <hr></hr>

      <h2>Se crea Group List</h2>
      <GroupForm />
    </StoreProvider>
  );
}

export default App;
