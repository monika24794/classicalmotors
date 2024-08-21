import React, { useState } from "react";
import axios from "axios";
import "./Signup.css";
import { Link } from "react-router-dom";

const Signup = () => {
  const [fname, setFirstName] = useState("");
  const [lname, setLastName] = useState("");
  const [city, setCity] = useState("");
  const [state, setState] = useState("");
  const [pincode, setPincode] = useState("");
  const [mobilenumber, setPhoneNumber] = useState("");
  const [email, setEmail] = useState("");
  const [username, setUserName] = useState("");
  const [password, setPassword] = useState("");
  const [role, setRole] = useState("Admin");

  const onOptionChange = (e) => {
    setRole(e.target.value);
  };
  async function SignUp(e) {
    e.preventDefault();
    let item = {
      fname,
      lname,
      city,
      state,
      pincode,
      mobilenumber,
      email,
      username,
      password,
      role,
    };
    //console.warn(item)

    axios
      .post("http://localhost:9545/user/add", {
        firstName: fname,
        lastName: lname,
        phoneNo: mobilenumber,
        email: email,
        city: city,
        state: state,
        pincode: pincode,
        username: username,
        password: password,
        role: role,
      })
      .then((res) => {
        console.log(res.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }

  return (
    <div
      className="container-signup"
      style={{ backgroundColor: "black", alignContent: "center" }}
    >
      <div className="container345">
        <div className="main">
          <div className="register">
            {/* <h2>Register Here</h2> */}
            <form id="register" onSubmit={SignUp}>
              <div className="row">
                <div className="col-6">
                  <label>First Name:</label>
                  <br />
                  <input
                    type="text"
                    name="fname"
                    id="fname"
                    value={fname}
                    onChange={(e) => setFirstName(e.target.value)}
                    placeholder="Enter First Name"
                  />
                  <br />
                  <br />
                </div>
                <div className="col-6">
                  <label>Last Name:</label>
                  <br />
                  <input
                    type="text"
                    name="lname"
                    id="lname"
                    value={lname}
                    onChange={(e) => setLastName(e.target.value)}
                    placeholder="Enter Last Name"
                  />
                  <br />
                  <br />
                </div>
              </div>

              <div className="row">
                <div className="col-6">
                  <label>Phone Number:</label>
                  <br />
                  <input
                    type="tel"
                    id="mobilenumber"
                    name="mobilenumber"
                    pattern="[0-9]{10}"
                    value={mobilenumber}
                    onChange={(e) => setPhoneNumber(e.target.value)}
                    placeholder="1234567890"
                    required
                  />
                  <br />
                  <br />
                </div>
                <div className="col-6">
                  <label>Email:</label>
                  <br />
                  <input
                    type="email"
                    name="email"
                    id="email"
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                    placeholder="Enter Email"
                  />
                  <br />
                  <br />
                </div>
              </div>

              <div className="row">
                <div className="col-6">
                  <label>city:</label>
                  <br />
                  <input
                    type="text"
                    name="city"
                    id="city"
                    value={city}
                    onChange={(e) => setCity(e.target.value)}
                    placeholder="Enter Address"
                  />
                  <br />
                  <br />
                </div>
                <div className="col-6">
                  <label>State:</label>
                  <br />
                  <input
                    type="text"
                    name="state"
                    id="state"
                    value={state}
                    onChange={(e) => setState(e.target.value)}
                    placeholder="Enter Address"
                  />
                  <br />
                  <br />
                </div>
              </div>

              <div className="row">
                <div className="col-6">
                  <label>UserName:</label>
                  <br />
                  <input
                    type="text"
                    name="username"
                    id="username"
                    value={username}
                    onChange={(e) => setUserName(e.target.value)}
                    placeholder="Enter UserName"
                  />
                  <br />
                  <br />
                </div>
                <div className="col-6">
                  <label>Password:</label>
                  <br />
                  <input
                    type="password"
                    name="password"
                    id="password"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    placeholder="Enter Password"
                  />
                  <br />
                  <br />
                </div>
              </div>

              <label>Pincode:</label>
              <br />
              <input
                type="text"
                name="pincode"
                id="pincode"
                value={pincode}
                onChange={(e) => setPincode(e.target.value)}
                placeholder="Enter Address"
              />
              <br />
              <br />

              <div className="row">
                <div className="col-6">
                  <label htmlFor="role">Select Role</label>
                  <select
                    id="role"
                    name="role"
                    value={role}
                    onChange={onOptionChange}
                    className="form-control"
                  >
                    <option value="Customer">Customer</option>

                    <option value="Admin">Admin</option>
                  </select>
                </div>

                <div className="signupbutton">
                  <button
                    type="submit"
                    value="Submit"
                    name="submit"
                    id="submit"
                  >Submit
                    {/* <Link className="nav-link" to="/login">
                      {" "}
                      Submit
                    </Link> */}
                  </button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Signup;
