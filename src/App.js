import logo from './logo.svg';
import './App.css';
import Login from './Login.js';
import Registration from './registration.js';
import Sviet from './sviet.js';
function App() {
  return (
    <div className="App">
      <header className="App-header">
          <img src={"https://www.sviet.edu.in/wp-content/uploads/2023/05/SVIET-LOGO-Edited.png"} className="App-logo" alt="logo" />
        <p>
          SRI VASAVI INSTITUTE OF ENGINEERING AND TECHNOLOGY
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          sviet
        </a> 
        {/* <Login/>
        <Registration/>  */}
        <Sviet value="Empowering minds..."/>
      </header>
    </div>
  );
}

export default App;
