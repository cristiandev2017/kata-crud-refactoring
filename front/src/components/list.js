import React, {Component} from 'react';
//Se utiliza axios como facilitador de peticiones al servidor
import axios from 'axios';

//Se obtiene pone como constante la constante con la URL de la aplicacion
const HOST_API = "http://localhost:8080/api";
//Se crea la clase List con las propiedades de un componente de React
class List extends Component{
    //Se utiliza state con un arreglo vacio el cual me guardara la lista
    state = {
    lists: []
  }
  //Este metodo lo que hace es que cuando el componente este cargado ejecuta la funcion que le mandemos
  componentDidMount() {
    axios.get(HOST_API + "/todos")
      .then(res => {
        const lists = res.data;
        //Se almacenara la lista de los elementos
        this.setState({ lists });
      })
  }
    //Por ultimo haremos render a la pagina principal(Tabla)
    render() {
        return (
      <div>
        <table>
            <thead>
                <tr>
                    <td>ID</td>
                    <td>Tarea</td>
                    <td>¿Completado?</td>
                </tr>
           </thead>
   <tbody>
       { this.state.lists.map(list => <li>{list.id}</li>)}

            </tbody>
        </table>
      </div>
    )
  }
}

 //{ this.state.lists.map(list => <li>{list.id}</li>)}

export default List;