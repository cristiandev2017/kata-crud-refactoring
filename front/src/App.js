import React,{Component} from 'react';
import List from './components/list'

const HOST_API = "http://localhost:8080/api";
class App extends Component{
  render(){
    return <List />
  }
}


export default App;
