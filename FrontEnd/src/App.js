import './App.css';
import "bootstrap/dist/css/bootstrap.min.css";
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Login from './pages/Login';
import Student from './pages/Student';



function App() {
  return (
    <div className="App">
     <Router>

     <Navbar/>

     <Routes>
        <Route exact path="/" element={<Login/>}/>
        <Route exact path="/Home/:id" element={<Home/>}></Route>
        <Route exact path="/Student/:employeeID" element={<Student/>}></Route>
        
     </Routes>
  
     </Router>
     

    </div>
  );
}

export default App;
