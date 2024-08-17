import React from "react";
import { useSelector } from "react-redux";
import { Link } from "react-router-dom";
import { logout } from "../login/authSlice";
import { useDispatch } from "react-redux";
import { postRequest } from "../login/Api/api";
import { useNavigate } from "react-router-dom"; 
export default function Navbar() {
  const token = useSelector((state) => state.auth.jwtToken);
  const navigate = useNavigate();
  const dispatch = useDispatch();
  async  function handleLogout() {
    dispatch(logout());
    navigate("/");
  }
  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
        <div className="container-fluid">
          <Link className="navbar-brand" to="/Home">
            Faculty Time Table
          </Link>
          {(token)&&(<button
            class="btn btn-danger"
            onClick={handleLogout}
          >
            Logout
          </button>)}
        </div>
      </nav>
    </div>
  );
}