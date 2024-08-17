import { setUser, setToken, setError, clearError, logout } from "./authSlice";
import { authApi } from "./authApi";

export const loginUser = (userData) => async (dispatch) => {
  try {
    dispatch(clearError());
    const response = await authApi.login(userData);
    dispatch(setUser(response.user));
    dispatch(setToken(response.token));
  } catch (error) {
    dispatch(setError(error.message));
  }
};

export const logoutUser = () => async (dispatch) => {
  try {
    dispatch(logout());
  } catch (error) {
    dispatch(setError(error.message));
  }
};
