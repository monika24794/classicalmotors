import React, { useEffect } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';

const TestimonialCarousel = () => {
    return (
        <section>
            <div className="container">
                <div className="row">
                    <div className="col-sm-12">
                        <div id="myCarousel" className="carousel slide" data-bs-ride="carousel">
                            {/* Carousel indicators */}
                            <ol className="carousel-indicators">
                                <li data-bs-target="#myCarousel" data-bs-slide-to="0" className="active"></li>
                                <li data-bs-target="#myCarousel" data-bs-slide-to="1"></li>
                                <li data-bs-target="#myCarousel" data-bs-slide-to="2"></li>
                            </ol>
                            {/* Wrapper for carousel items */}
                            <div className="carousel-inner">
                                <div className="carousel-item active" data-bs-interval="3000">
                                    <div className="row">
                                        <div className="col-sm-12">
                                            <div className="testimonial-wrapper">
                                                <div className="testimonial">Excellent doorstep service.
                                                    I got my XL6 coated from Classical Motors.
                                                    The service was very prompt and staff was polite. they completed
                                                    the job diligently. The pricing is very competitive and the services
                                                    were top class. Will definitely recommend to users.
                                                </div>
                                                <div className="media">
                                                    <img src="/img/profile-icon-9.png" className="mr-3" alt="" />
                                                    <div className="media-body">
                                                        <div className="overview">
                                                            <div className="name"><b>Parth Ghatge</b></div>
                                                            <div className="details">Media Analyst / SkyNet</div>
                                                            <div className="star-rating">
                                                                <ul className="list-inline">
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star-half-o"></i></li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div className="col-sm-12" style={{ margin: "0 0 50px 0" }}>
                                            <div className="testimonial-wrapper">
                                                <div className="testimonial">
                                                    Skilled and dedicated to work staff. They
                                                    worked almost 3.5 hours and ensured quality work was done. It’s been a
                                                    pleasant experience. I would definitely continue doing business with and
                                                    will recommend them to all. Thank you team Car keepers.
                                                    <a href="#" data-bs-toggle="collapse" data-bs-target="#demoread">Read More
                                                        <i className="fa fa-arrow-right"></i></a>
                                                    <div id="demoread" className="collapse">
                                                        Scheduled an appointment for the second time and as always
                                                        they never let me down. The high skilled staff almost cleaned the
                                                        vehicle for 7 long hours and had it shine. Amazing work and would
                                                        like to recommend them to all those car lovers in Pune.
                                                    </div>
                                                </div>
                                                <div className="media">
                                                    <img src="/img/profile-icon-9.png" className="mr-3" alt="" />
                                                    <div className="media-body">
                                                        <div className="overview">
                                                            <div className="name"><b>Amit Chougule</b></div>
                                                            <div className="details">Web Developer / SoftBee</div>
                                                            <div className="star-rating">
                                                                <ul className="list-inline">
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star-o"></i></li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div className="carousel-item" data-bs-interval="3000">
                                    <div className="row">
                                        <div className="col-sm-12" style={{ margin: "0 0 50px 0" }}>
                                            <div className="testimonial-wrapper">
                                                <div className="testimonial">Recently used their service for the first
                                                    time and would like to say it was done with utmost care and
                                                    professionalism. Booked their appointment via phone call and things were
                                                    explained pretty well with all the necessary details to me.
                                                    <a href="#" data-bs-toggle="collapse" data-bs-target="#demoread2">Read More
                                                        <i className="fa fa-arrow-right"></i></a>
                                                    <div id="demoread2" className="collapse"> I found the pricing very
                                                        reasonable compared to products they used.
                                                        Would highly recommend everyone to use their services!
                                                    </div>
                                                </div>
                                                <div className="media">
                                                    <img src="/img/profile-icon-9.png" className="mr-3" alt="" />
                                                    <div className="media-body">
                                                        <div className="overview">
                                                            <div className="name"><b>Ankit Negi</b></div>
                                                            <div className="details">Web Developer / DevCorp</div>
                                                            <div className="star-rating">
                                                                <ul className="list-inline">
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star-o"></i></li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div className="col-sm-12" style={{ margin: "0 0 50px 0" }}>
                                            <div className="testimonial-wrapper">
                                                <div className="testimonial">Task done very meticulously. The people
                                                    working take pride in their efforts and you can see it in the results.
                                                    It was my first experience in Pune City and I was truly impressed by the
                                                    owner as he delivered what he said, which many people don't.
                                                    <a href="#" data-bs-toggle="collapse" data-bs-target="#demoread1">Read More
                                                        <i className="fa fa-arrow-right"></i></a>
                                                    <div id="demoread1" className="collapse"> The professionals working
                                                        on the car took it as a personal challenge and completed it very
                                                        impressively.
                                                        I was with them the entire 6 hours and I was happy as they kept
                                                        on proceeding with their work as they went into much more detail and
                                                        I was amazed by the level of craftsmanship done on my car.
                                                        Every rupee well spent. Value for money.
                                                        Do contact Satyajit. And give him my reference for a
                                                        discount.
                                                    </div>
                                                </div>
                                                <div className="media">
                                                    <img src="/img/profile-icon-9.png" className="mr-3" alt="" />
                                                    <div className="media-body">
                                                        <div className="overview">
                                                            <div className="name"><b>Vedant Deshpande</b></div>
                                                            <div className="details">Graphic Designer / MarsMedia</div>
                                                            <div className="star-rating">
                                                                <ul className="list-inline">
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star"></i></li>
                                                                    <li className="list-inline-item"><i className="fa fa-star-o"></i></li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            {/* Carousel controls */}
                            <a className="carousel-control-prev" href="#myCarousel" role="button" data-bs-slide="prev">
                                <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span className="visually-hidden">Previous</span>
                            </a>
                            <a className="carousel-control-next" href="#myCarousel" role="button" data-bs-slide="next">
                                <span className="carousel-control-next-icon" aria-hidden="true"></span>
                                <span className="visually-hidden">Next</span>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    );
};

export default TestimonialCarousel;
