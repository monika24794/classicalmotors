// import React from 'react';
// import Footer from './Footer/Footer';
// import Header from './Header/Header';
// import AboutUs from './Aboutus/About';
// import TestimonialCarousel from './Testimonials/Testimonials';
// import Bookappointment from './Bookappointment/Bookappointment';
//import OwlCarousel from 'react-owl-carousel2';
//import 'react-owl-carousel2/lib/styles.css'; // Make sure to import the CSS file if required

import React from 'react';
import { BrowserRouter as Router, Route, Routes, Outlet } from 'react-router-dom';
import Header from './Header/Header';
import Footer from './Footer/Footer';
import About from './Aboutus/About';
import Services from './Services/Services';
import Home from './Home/Home'; // Make sure this component exists
import Bookappointment from './Bookappointment/Bookappointment';

import Login, { CustomerLogin } from './Login/Login';
import Signup from './Signup/Signup';
//import Login from './Login/Login';

//....

import Invoice from './Invoice/Invoice';
import Offer from './Offer/Offer';
import ServiceRecord from './ServiceHistory/ServiceRecord';
import AdminPage from './Admin/Admin';
import CustomerPage from './Customer/customer';
//....

function App() { 
    return (
    //     <div className="App">
    //       <Header/>
          
    //      <AboutUs></AboutUs>
           
    //   <TestimonialCarousel></TestimonialCarousel>
    //         <Footer/>
    //         <Bookappointment/>
    //     </div>
    <Router>
            <div className="App">
               
                <Header />
                <Outlet />
                
                <Routes>
                    {/* <Route index element={<App/>} /> */}
                    <Route path="/" element={<Home />} />
                    <Route path="/about" element={<About />} />
                    <Route path="services" element={<Services/>} />
                    <Route path="book" element={<Bookappointment/>} />
                    <Route path="login" element={<CustomerLogin/>} />
                    <Route path="signup" element={<Signup/>} />
                    <Route path="CustomerPage" element={<CustomerPage/>} />
                    <Route path="invoice" element={<Invoice/>} />
                    <Route path="offer" element={<Offer/>} />
                    <Route path="servicerecord" element={<ServiceRecord/>} />
                    <Route path="AdminPage" element={<AdminPage/>} />
                </Routes>
               
                {/* <TestimonialCarousel /> */}
                 <Footer />
               
            </div>
        </Router>
    );
}

export default App;
