import logo from './logo.svg';
import './App.css';
import Intro from './intro.js';
function App() {
  return (
    <div className="App">
      <div>
        <legend>login form</legend>
        <label for="">Email Id : <span>*</span></label>
        <input type="email" name=""id="" placeholder="enter mail" autofocus></input>
        <br></br>
        <label>Password : </label>
        <input type="password" name=""id="" placeholder="password"></input>
        <br></br>
        <button>login</button>
        <br></br>
      </div>
    </div>
  );
}

export default App;
