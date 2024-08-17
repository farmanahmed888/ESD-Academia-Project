import { createSlice } from "@reduxjs/toolkit";
import { persistReducer } from "redux-persist";
import storage from "redux-persist/lib/storage"; 
const persistConfig = {
  key: "auth",
  storage,
};
const authSlice = createSlice({
  name: "auth",
  initialState: {
    employeeId: null,
    jwtToken: null,
    error: null,
  },
  reducers: {
    setCredentials: (state, action) => {
      state.employeeId=action.payload.employeeId;
      state.jwtToken=action.payload.jwtToken;
      //state.role = action.payload.role;
      state.error = null;
    },
    setError: (state, action) => {
      state.error = action.payload;
    },
    clearError: (state) => {
      state.error = null;
    },
    logout: (state) => {
      state.employeeId = null;
      state.jwtToken = null;
      state.error = null;
    },
  },
});

export const { setCredentials, setError, clearError, logout } = authSlice.actions;
const persistedReducer = persistReducer(persistConfig, authSlice.reducer);
export default persistedReducer;