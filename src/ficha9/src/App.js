import "./App.css";

import { Layout } from "./Ex2/Layout";
import { Contador } from "./Ex3_Contador/Contador";
import { ToDo } from "./Ex4_ToDoList/ToDo";

function App() {
  return (
    <div className="App">
      {<Layout></Layout>}
      {<Contador></Contador>}
      {<ToDo></ToDo>}
    </div>
  );
}

export default App;
