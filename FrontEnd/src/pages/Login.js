import React, { useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import axios from 'axios';

export default function Login() {
  let navigate = useNavigate();

  const [loginData, setLoginData] = useState({
    email: '',
    password: '',
  });

  const { email, password } = loginData;

  const [loginStatus, setLoginStatus] = useState(false);
  const [msg, setMsg] = useState('');

  const onInputChange = (e) => {
    setLoginData({ ...loginData, [e.target.name]: e.target.value });
  };

  const onSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post('http://localhost:9001/login/getEmployeeID', {
        email: email,
        password: password,
      });
      
      const user = response.data;
      
      console.log(user);
      if (user !==-1) {
        setMsg('Login successful');
        setLoginStatus(true);
  
        navigate(`/Home/${user}`);
      } else {
        setMsg('Wrong password or email');
        setLoginStatus(false);
        alert(`Wrong password or email: ${msg}`);
        navigate('/');
      }
    } catch (error) {
      alert(`Login failed: ${error}`);
      navigate('/');
    }
  };

  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
          <h2 className="text-center m-4">Log in Employee</h2>
          <form onSubmit={(e) => onSubmit(e)}>
            <div className="mb-3">
              <label htmlFor="email" className="form-label">
                Enter Your Email
              </label>
              <input
                type="text"
                className="form-control"
                placeholder="Enter your Email"
                name="email"
                value={email}
                onChange={(e) => onInputChange(e)}
              />
            </div>

            <div className="mb-3">
              <label htmlFor="password" className="form-label">
                Enter Password
              </label>
              <input
                type="password"
                className="form-control"
                placeholder="Enter your password"
                name="password"
                value={password}
                onChange={(e) => onInputChange(e)}
              />
            </div>

            <button type="submit" className="btn btn-outline-primary">
              Submit
            </button>
            <Link className="btn btn-outline-danger mx-2" to="/">
              Cancel
            </Link>
          </form>
        </div>
      </div>
    </div>
  );
}
