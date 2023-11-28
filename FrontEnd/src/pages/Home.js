import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link, useParams } from 'react-router-dom';

export default function Home() {
  const [users, setUsers] = useState([]);
  const { id } = useParams();
  console.log(id);

  useEffect(() => {
    loadUsers(id);
  }, [id]);

  const loadUsers = async (userId) => {
    try {
      const result = await axios.get(`http://localhost:9001/courseschedule/course/${userId}`);
      console.log(result.data);
      setUsers(result.data);
    } catch (error) {
      console.error('Error loading users:', error);
    }
  };

  const deleteUser = async (userId) => {
    try {
      await axios.delete(`http://localhost:9001/user/${userId}`);
      loadUsers(id);
    } catch (error) {
      console.error('Error deleting user:', error);
    }
  };

  return (
    <div className="container">
      <div className="py-4">
        <table className="table border shadow">
          <thead>
            <tr>
              <th scope="col">S.N</th>
              <th scope="col">Name</th>
              <th scope="col">Username</th>
              <th scope="col">Email</th>
              <th scope="col">Actions</th>
              <th scope="col">Actions</th>
              <th scope="col">Actions</th>
              <th scope="col">Actions</th>
            </tr>
          </thead>
          <tbody>
            {users.map((user, index) => (
              <tr key={index}>
                <th scope="row">{index + 1}</th>
                <td>{user[0].courseCode}</td>
                <td>{user[1].name}</td>
                <td>{user[0].time}</td>
                <td>{user[0].day}</td>
                <td>{user[0].room}</td>
                <td>{user[0].building}</td>
                <td>
                  
                  <Link className="btn btn-outline-primary mx-2" to={`/Student/${user[1].employee.employeeID}`}>
                    See enrolled
                  </Link>
                  
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}
