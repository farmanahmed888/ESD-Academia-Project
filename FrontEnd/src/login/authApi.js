import axios from "axios";
import { LOCALHOST } from "../config";

const baseURL = `${LOCALHOST}`;

const authApi = {
  login: async (userData) => {
    try {
      const response = await axios.post(`${baseURL}/login/getEmployeeID`, userData);
      console.log(response.data);
      return response.data;
    } catch (error) {
      throw new Error(error.response.data.message);
    }
  },
};

export { authApi };
