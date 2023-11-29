import React, { useState } from 'react';

import { Link, useNavigate } from 'react-router-dom';

export default function Login() {
  let navigate = useNavigate();

  const [loginData, setLoginData] = useState({
    email: '',
    password: '',
  });

  const { email, password } = loginData;

  const [loginStatus, setLoginStatus] = useState(false);
  const [msg, setMsg] = useState('');

  const userMap = new Map([
    ['johndoe@example.com', { password: 'Password1', id: 1 }],
    ['janesmith@example.com', { password: 'Password2', id: 2 }],
    ['markjohnson@example.com', { password: 'Password3', id: 3 }],
    ['amywilliams@example.com', { password: 'Password4', id: 4 }],
    ['chrisanderson@example.com', { password: 'Password5', id: 5 }],
    ['susanbrown@example.com', { password: 'Password6', id: 6 }],
    ['brianclark@example.com', { password: 'Password7', id: 7 }],
    ['emilymoore@example.com', { password: 'Password8', id: 8 }],
    ['davidroberts@example.com', { password: 'Password9', id: 9 }],
    ['lisataylor@example.com', { password: 'Password10', id: 10 }],
    ['ryanmiller@example.com', { password: 'Password11', id: 11 }],
    ['caroljones@example.com', { password: 'Password12', id: 12 }],
    ['stevenwilson@example.com', { password: 'Password13', id: 13 }],
    ['laurasmith@example.com', { password: 'Password14', id: 14 }],
    ['kevinbrown@example.com', { password: 'Password15', id: 15 }],
    ['melissajones@example.com', { password: 'Password16', id: 16 }],
    ['adamclark@example.com', { password: 'Password17', id: 17 }],
    ['sarahmoore@example.com', { password: 'Password18', id: 18 }],
    ['alexroberts@example.com', { password: 'Password19', id: 19 }],
    ['jacktaylor@example.com', { password: 'Password20', id: 20 }]
    // Add more users as needed
  ]);

  const onInputChange = (e) => {
    setLoginData({ ...loginData, [e.target.name]: e.target.value });
  };

  const onSubmit = async (e) => {
    e.preventDefault();

    try {
      const user = userMap.get(email);

      if (user && user.password === password) {
        console.log(user.id);
        setMsg('Login successful');
        setLoginStatus(true);

        navigate(`/Home/${user.id}`); // Include the user ID in the route
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
