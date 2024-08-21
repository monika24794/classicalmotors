import React from 'react';
import './Aboutus.css';
import logo1 from './Fimage.png'

const AboutUs = () => {
    return (
        
        <section id="aboutus" className="py-4">
            <div className="container">
                <div className="row headings">
                    <div className="section-title">
                        <h2>About Us</h2>
                    </div>
                </div>

                <div className="row section" id="about-me">
                    <div className="col-lg-6 pt-4 pt-lg-0 order-2 order-lg-1 content">
                        <div className="view">
                            <img src={logo1} alt="Classical Motors" id="image" className="img-fluid" />
                        </div>
                    </div>
                    <div className="col-lg-6 order-1 order-lg-2 py-3 aboutuscontent">
                        <div className="well">
                            <p>
                                Welcome to Classical Motars Car Washing and Care Center,
                                where we treat your car with the best care possible.
                                Our goal is to make your car look amazing with our top-quality washing and detailing
                                services.
                                At Classical Motars, we know your car is important to you. Our team of skilled
                                professionals uses the latest tools and methods to clean every part of your car
                                thoroughly. From gentle hand washes that protect your car’s paint to detailed
                                cleaning of the inside and outside, we ensure your car looks its best.

                                We use eco-friendly products that are safe for both your car and the environment.
                                Our focus on detail and customer satisfaction makes us stand out. Whether you need a
                                quick wash or a deep clean, Classical Motars promises excellent service.

                                Come visit us today and see why Classical Motars Car Washing and Care Center is the
                                best place for your car. We take pride in making your car shine!
                            </p>
                            <p>
                                <b className="fs-6">Why Choose Us <br /></b>
                                1. Expert Team: Skilled professionals with years of experience.<br />
                                2. Top-Quality Services: Comprehensive washing and detailing.<br />
                                3. Eco-Friendly: Safe, environmentally friendly products.<br />
                                4. Advanced Equipment: Cutting-edge tools for the best care.<br />
                                5. Customer Satisfaction: Personalized, attentive service.<br />
                                6. Convenience: Fast and reliable, fitting your schedule.<br />
                                Choose Classical Motars Car Washing and Care Center for exceptional care<br />
                                and service for your vehicle.<br />
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    );
};

export default AboutUs;
