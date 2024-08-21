import React from 'react';
import './Footer.css';  // Import the CSS file

const Footer = () => {
    return (
        <footer className="footer bg-dark text-white text-center py-4">
            <section id="callaction" className="py-4" style={{ padding: '20px 0' }}>
                <div className="container">
                    <div className="row section">
                        <p>Quality Car Care At Your Nashik!</p>
                    </div>
                </div>
            </section>

            <div className="footer-content py-4" style={{ padding: '20px 0' }}>
                <div className="container">
                    <div className="footer-flex">
                        <div className="footer-item">
                            <h4>The Future of <span>Auto Services</span></h4>
                            <p>Classical Motors is a complete car care service platform that brings super
                                convenience to car owners. We understand how hectic it is to take your vehicle to the service
                                centres, which is why we deliver our all-in-one car care solutions straight to your doorstep.</p>
                        </div>
                        <div className="footer-item">
                            <h4 className="text-uppercase">Quick Links</h4>
                            <ul>
                                <li><a className="nav-link" href="/about">About us</a></li>
                                <li><a className="nav-link" href="/services">Services</a></li>
                                <li><a href="#">Contact Us</a></li>
                                <li><a href="#">Car Washing</a></li>
                                <li><a href="#">FAQs</a></li>
                            </ul>
                            {/* <Link className='nav-link' to="/signup">Signup</Link> */}
                        </div>
                        <div className="footer-item">
                            <h4 className="text-uppercase">Contact us</h4>
                            <ul>
                                <li>
                                    <i className="fa fa-map-marker" style={{ marginRight: '5px' }}></i>
                                    <strong>Address:</strong> Plot No-17,Sr No 26/2B/1,Kishore Suryawanshi Marg,B/H RTO Office,Nashik,India,Maharashtra
                                </li>
                                <li>
                                    <i className="fa fa-phone" style={{ marginRight: '5px' }}></i>
                                    <strong>Phone:</strong>+91 90111 21111
                                </li>
                                <li>
                                    <i className="fa fa-envelope" style={{ marginRight: '5px' }}></i>
                                    <strong>Email:</strong>classicalmotors21@gmail.com
                                </li>
                            </ul>
                        </div>
                        <div className="footer-item">
                            <iframe
                                src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3748.3281692059504!2d73.79623757474388!3d20.03669252111294!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bddea327610b19d%3A0xb4e77c3c54ee5073!2sCLASSICAL%20MOTORS!5e0!3m2!1sen!2sin!4v1717694656192!5m2!1sen!2sin"
                                width="350"
                                height="330"
                                style={{ border: '0' }}
                                allowFullScreen=""
                                loading="lazy"
                                referrerPolicy="no-referrer-when-downgrade"
                            ></iframe>
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-lg-12 col-sm-12 col-xs-12">
                            <p className="copyright">
                                Copyright © 2024 <a href="#">Classical Motors</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
           
        </footer>
    );
};

export default Footer;
