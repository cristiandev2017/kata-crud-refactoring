import React from 'react';
import {StoreProvider} from './components/Store';
import List from './components/List';
import Form from './components/Form';

function App(){
  return(
    <StoreProvider>
      <h2>Se separa por componentes</h2>
      <Form/>
      <List />
    </StoreProvider>
  )
}

export default App;
