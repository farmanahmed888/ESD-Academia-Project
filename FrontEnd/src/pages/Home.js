import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link, useParams } from 'react-router-dom';
import { useSelector } from 'react-redux';
import { getRequest } from '../login/Api/api';


export default function Home() {
  const [users, setUsers] = useState([]);
  const id = useSelector((state) => state.auth.employeeId);
  const token = useSelector((state) => state.auth.jwtToken);
  console.log(id, token);
  useEffect(() => {
    loadUsers(id);
  }, [id]);

  const loadUsers = async (userId) => {
    try {
      //const headers = { Authorization: `Bearer ${token}` };
      const result = await getRequest(`/courseschedule/course/${userId}`);
      console.log(result);
      const courseSchedules = result;
      const firstName = courseSchedules[0][1].employee.firstName;
      const lastName = courseSchedules[0][1].employee.lastName;
      console.log('First Name:', firstName);
      console.log('Last Name:', lastName);
      console.log(result);
      setUsers(result);
    } catch (error) {
      console.error('Error loading users:', error);
    }

  };



  return (
    <div className="container">
      {users.length > 0 && (
        <div>
          Welcome {users[0][1].employee.firstName}  {users[0][1].employee.lastName}<br />
        </div>
      )}
      <div className="py-4">
        <table className="table border shadow">
          <thead>
            <tr>
              <th scope="col">S.N</th>
              <th scope="col">Course Code</th>
              <th scope="col">Subject</th>
              <th scope="col">Time</th>
              <th scope="col">Day</th>
              <th scope="col">Room</th>
              <th scope="col">building</th>
              <th scope="col">View Enrolled</th>
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

                  <Link className="btn btn-outline-primary mx-2" to={`/Student`}>
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
