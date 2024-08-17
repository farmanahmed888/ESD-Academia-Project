import axios from "axios";
import {LOCALHOST} from "../../config";
// Common headers or configurations can be set here

axios.defaults.baseURL = LOCALHOST; // Base URL for your API

// Function to make a GET request
export const getRequest = async (endpoint) => {
  try {
    const response = await axios.get(endpoint);
    console.log(response.data);
    return response.data;
  } catch (error) {
    throw error; // Propagate the error to handle it in the component
  }
};

// Function to make a POST request
export const postRequest = async (endpoint, data) => {
  try {
    const response = await axios.post(endpoint, data);
    console.log(response.data);
    return response.data;
  } catch (error) {
    throw error;
  }
};
// // Function to make a PUT request
// export const putRequest = async (endpoint, data,headers) => {
//   try {
//     const response = await axios.put(endpoint, data,{ headers });
//     return response.data;
//   } catch (error) {
//     throw error;
//   }
// };


// // Function to make a DELETE request
// export const deleteRequest = async (endpoint, headers) => {
//   try {
//     const response = await axios.delete(endpoint, { headers });
//     return response.data;
//   } catch (error) {
//     throw error;
//   }
// };