import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link, useParams } from 'react-router-dom';

export default function Home() {
  const [users, setUsers] = useState([]);
  const { id } = useParams();

  useEffect(() => {
    loadUsers(id);
  }, [id]);

  const loadUsers = async (userId) => {
    try {
      const result = await axios.get(`https://faculty-time-table-432516.uc.r.appspot.com/courseschedule/course/${userId}`);
      const courseSchedules = result.data;
      const firstName = courseSchedules[0][1].employee.firstName;
      const lastName = courseSchedules[0][1].employee.lastName;
      console.log('First Name:', firstName);
      console.log('Last Name:', lastName);
      console.log(result.data);
      setUsers(result.data);
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
