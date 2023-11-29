import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useParams } from 'react-router-dom';

export default function Student() {
  const [users, setUsers] = useState([]);
  const { employeeID } = useParams();
  console.log(employeeID);

  useEffect(() => {
    loadUsers(employeeID);
  }, [employeeID]);

  const loadUsers = async (userId) => {
    try {
      console.log("user id is " + userId);
      const result = await axios.get(`http://localhost:9001/studentcourses/all/${userId}`);
      console.log(result.data);
      setUsers(result.data);
    } catch (error) {
      console.error('Error loading users:', error);
    }
  };
  return (
    <div className="container">
      <div className="py-4">
        <table className="table border shadow">
          <thead>
            <tr>
              <th scope="col">rollNumber</th>
              <th scope="col">firstName</th>
              <th scope="col">lastName</th>

            </tr>
          </thead>
          <tbody>
            {users.map((user, index) => (
              <tr key={index}>
                <td>{user[0].rollNumber}</td>
                <td>{user[0].firstName}</td>
                <td>{user[0].lastName}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}
