import axios from 'axios';

export class ListaService{
    const = HOST_API = "http://localhost:8080/api";
    getAll(){   
        return axios.get(this.HOST_API + "/todos").then(res=>res);
    }
}