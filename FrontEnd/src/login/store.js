import { configureStore, applyMiddleware } from "@reduxjs/toolkit";
import { persistStore } from "redux-persist";
import authReducer from "./authSlice";
import { thunk } from "redux-thunk";

const store = configureStore({
  reducer: {
    auth: authReducer,
  },
},applyMiddleware(thunk));
const persistor = persistStore(store);
export {store,persistor};
