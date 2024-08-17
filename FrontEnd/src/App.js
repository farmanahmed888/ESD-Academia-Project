import './App.css';
import "bootstrap/dist/css/bootstrap.min.css";
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { useSelector } from "react-redux";
import { useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import Login from './pages/Login';
import Student from './pages/Student';

// ProtectedRoute component
const ProtectedRoute = ({ children }) => {
  const token = useSelector((state) => state.auth.jwtToken);
  const navigate = useNavigate();

  useEffect(() => {
    if (!token) {
      navigate('/');
    }
  }, [token, navigate]);

  return token ? children : null;
}

function App() {
  return (
    <div className="App">
      <Router>
        <Navbar />
        <Routes>
          <Route path="/" element={<Login />} />
          {/* Protected Routes */}
          <Route path="/Home" element={<ProtectedRoute><Home /></ProtectedRoute>} />
          <Route path="/Student" element={<ProtectedRoute><Student /></ProtectedRoute>} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
