import React, { useState } from 'react';
import './Header.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import logo from './headerlogo-removebg-preview.png';
import { Link } from 'react-router-dom';


// import { Link } from 'react-router-dom';




const Header = () => {

    const [isNavCollapsed, setIsNavCollapsed] = useState(true);

    const handleToggleCollapse = () => {
        setIsNavCollapsed(!isNavCollapsed);
    };

    return (
        <div className="page-wraper" style={{backgroundColor:'black'}}>
            <header className="site-header header header-style-6 style-1 mo-left" style={{backgroundColor:'black'}}>
                <div className="extra-section">
                    <div className="container">
                        <div className="row"> 
                            <div className="col-md-12">
                                <div className="content blinkmsg">
                                    <div className="section-title" >
                                        <h2 className="blink text-center" style={{ color: 'white'}} >Bring your car's showroom shine back starting at ₹ 99 /- </h2>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div className="container-fluid-top-header-lg" style={{ backgroundColor: 'white', color: 'black'}}>
                    <div className="d-flex bd-highlight">
                        <div className="p-2 flex-grow-1 bd-highlight">
                            <Link to="/"><img src={logo} alt="" className="img-fluid" /></Link> 
                        </div>
                        <div className="p-2 bd-highlight">
                            <h6><i className="fa fa-envelope ficon" aria-hidden="true"></i> Send us a Mail</h6>
                            <span>classicalmotors21@gmail.com</span>
                        </div>
                        <div className="p-2 bd-highlight">
                            <h6><i className="fa fa-mobile ficon" aria-hidden="true"></i> Call Us</h6>
                            <span>+91 90111 21111</span>
                        </div>
                        <div className="p-2 bd-highlight">
                            <h6><i className="fa fa-clock-o ficon" aria-hidden="true"></i> OPENING TIME</h6>
                            <span>09:00 AM - 06:00 PM</span>
                        </div>
                    </div>
                </div>

                <div className="container-fluid top-header-sm">
                    <div className="w-100 py-2">
                        <div className="w-100">
                            <div className="w-auto float-start">
                                <i className="fa fa-mobile ficon fs-5" aria-hidden="true"></i>+91 90111 21111
                            </div>
                            <div className="w-auto float-end">
                                <a href="#bookappointment" className="book-now-mob btn btn-outline-primary">Appointment</a>
                            </div>
                            <div className="clearfix"></div>
                        </div>
                    </div>
                </div>
                                                              
                <div className="container-fluid-logo-header" style={{ backgroundColor: '#191f23'}}>
                    <nav className="navbar navbar-expand-lg w-100 navbar-light">
                        <div className="collapse navbar-collapse flex-row-reverse" id="navbarNavDropdown">
                            <ul className="navbar-nav">
                                <li className="nav-item" >
                                <Link className="nav-link" aria-current="page" to="/" style={{color:'white'}}>Home</Link>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/login" style={{color:'white'}}>Login</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/signup" style={{color:'white'}}>Signup</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/about" style={{color:'white'}}>About Us</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/services" style={{color:'white'}}>Services</a>
                                </li>
                                {/* <li className="nav-item">
                                    <a className="nav-link" href="/gallary" style={{color:'white'}}>Gallery</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="https://ClassicalMotors.in/#blog" style={{color:'white'}}>Testimonial</a>
                                </li> */}
                                </ul>
                        </div>
                        <a href="/login" className="book-now btn btn-outline-danger">Book Appointment</a>
                    </nav>
                </div>
            </header>
        </div>
        
    );
};

export default Header;
