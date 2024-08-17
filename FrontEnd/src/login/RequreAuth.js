import { useLocation, Navigate, Outlet } from "react-router-dom";
import { UseSelector, useSelector } from "react-redux";
const RequreAuth = () => {
  const token = useSelector((state) => state.auth.token);
  const location = useLocation();
  return !!token ? (
    <Outlet />
  ) : (
    <Navigate to="/" state={{ from: location }} replace />
  );
};

export default RequreAuth;
