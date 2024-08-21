import React, { useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import axios from 'axios';
import './Login.css'

export const CustomerLogin = () => {
  const navigate = useNavigate();

  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [role, setRole] = useState('customer');
  const [showRegister, setShowRegister] = useState(false);
  const [showForgotPassword, setShowForgotPassword] = useState(false);

  const handleRegister = () => {
    navigate('/register'); 
  };

  const handleLogin = (event) => {
    event.preventDefault();
    console.log(username, password, role);

    axios.post('http://localhost:9545/user/login', { username, password })
      .then(result => {
        // Redirect to the appropriate dashboard based on role
        if (role === 'admin' || role === 'agent') {
          alert("You are not authorized as a customer");
        } else if (role === 'customer') {
          navigate('/customerDashboard');
        }
        console.log(result);
        alert('Login successful');
      })
      .catch(error => {
        console.error('Login failed:', error);
        alert('Login failed');
      });
  };

  const handleForgotPassword = (event) => {
    event.preventDefault();
    // Handle forgot password logic here
    console.log("Forgot password for username:", username);
  };

  return (
    
    <div className="login-container" style={{backgroundColor :"black",width :500}}>
      <h2>Customer Login</h2>
      <form onSubmit={handleLogin}>
        <div className="form-group">
          <label>Username:</label>
          <input
            type="text"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label>Password:</label>
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label>Role:</label>
          <select value={role} onChange={(e) => setRole(e.target.value)}>
            <option value="customer">Customer</option>
            <option value="admin">Admin</option>
            <option value="agent">Agent</option>
          </select>
        </div>
        <button type="submit">Login
        {/* <Link className="nav-link" to="/book">  Login</Link> */}
          </button>
      </form>
      <div className="login-links">
        <p>
          Don't have an account?{' '}
          <button onClick={() => setShowRegister(true)}>Register
          {/* <Link className="nav-link" to="/signup">  Register</Link> */}
            </button>
        </p>
        <p>
          Forgot password?{' '}
          <span onClick={() => setShowForgotPassword(true)}>Forgot Password</span>
        </p>
      </div>

      {showRegister && (
        <div className="register-form">
          <h2>Register</h2>
          <form onSubmit={handleRegister}>
            <div className="form-group">
              <label>Username:</label>
              <input
                type="text"
                value={username}
                onChange={(e) => setUsername(e.target.value)}
                required
              />
            </div>
            <div className="form-group">
              <label>Password:</label>
              <input
                type="password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                required
              />
            </div>
            <button type="submit">Register</button>
          </form>
        </div>
      )}

      {showForgotPassword && (
        <div className="forgot-password-form">
          <h2>Forgot Password</h2>
          <form onSubmit={handleForgotPassword}>
            <div className="form-group">
              <label>Username:</label>
              <input
                type="text"
                value={username}
                onChange={(e) => setUsername(e.target.value)}
                required
              />
            </div>
            <button type="submit">Send Reset Link</button>
          </form>
        </div>
      )}
    </div>
    
  );
};
export default CustomerLogin;