// // src/Carousel.js
// import React, { useEffect, useState } from 'react';

// import styled from 'styled-components';

// /* Add in your main CSS file */
// import "~slick-carousel/slick/slick.css";
// import "~slick-carousel/slick/slick-theme.css";


// // Carousel Container
// const CarouselContainer = styled.div`
//   position: relative;
//   width: 80%;
//   margin: auto;
//   overflow: hidden;
// `;
// import 'bootstrap/dist/css/bootstrap.min.css';
// import 'owl.carousel/dist/assets/owl.carousel.css';
// import 'owl.carousel/dist/assets/owl.theme.default.css';
// import OwlCarousel2 from 'react-owl-carousel2';
// import './Gallery.css';
// import $ from 'jquery';

// const Gallery = () => {

//     useEffect(() => {
//         const loadScript = (src) => {
//             return new Promise((resolve, reject) => {
//                 const script = document.createElement('script');
//                 script.src = src;
//                 script.onload = resolve;
//                 script.onerror = reject;
//                 document.body.appendChild(script);
//             });
//         };

//         loadScript('https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js');
//         loadScript('https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js');
//         loadScript('https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js').then(() => {
//             $('.owl-carousel').owlCarousel({
//                 loop: true,
//                 margin: 10,
//                 nav: true,
//                 responsive: {
//                     0: {
//                         items: 1
//                     },
//                     600: {
//                         items: 3
//                     },
//                     1000: {
//                         items: 3
//                     }
//                 }
//             });
//         });
//     }, []);

//     return (
//         <section>
//             <div className="row headings">
//                 <div className="section-title" style={{ backgroundColor: '#191f23' }}>
//                     <h2 className="mt-3" style={{ color: '#ee1f23' }}>Gallery</h2>
//                 </div>
//             </div>
//             <div className="container-fluid">
//                 <div className="row mt-5">
//                     <OwlCarousel2 className="owl-theme" options={{ loop: true, margin: 10, nav: true }}>
//                         <div className="item mb-4">
//                             <div className="card border-0 shadow">
//                                 <img src="./image/pic5.jpg" alt="" className="card-img-top" />
//                                 <div className="card-body">
//                                     <h4>Car Cleaning</h4>
//                                 </div>
//                             </div>
//                         </div>
//                         <div className="item mb-4">
//                             <div className="card border-0 shadow">
//                                 <img src="./image/pic5.jpg" alt="" className="card-img-top" />
//                                 <div className="card-body">
//                                     <h4>Car Cleaning</h4>
//                                 </div>
//                             </div>
//                         </div>
//                         <div className="item mb-4">
//                             <div className="card border-0 shadow">
//                                 <img src="Gallery/image/pic5.jpg" alt="" className="card-img-top" />
//                                 <div className="card-body">
//                                     <h4>Car Cleaning</h4>
//                                 </div>
//                             </div>
//                         </div>
//                         <div className="item mb-4">
//                             <div className="card border-0 shadow">
//                                 <img src="Gallery/image/pic5.jpg" alt="" className="card-img-top" />
//                                 <div className="card-body">
//                                     <h4>Car Cleaning</h4>
//                                 </div>
//                             </div>
//                         </div>
//                         <div className="item mb-4">
//                             <div className="card border-0 shadow">
//                                 <img src="Gallery/image/pic5.jpg" alt="" className="card-img-top" />
//                                 <div className="card-body">
//                                     <h4>Car Cleaning</h4>
//                                 </div>
//                             </div>
//                         </div>
//                         <div className="item mb-4">
//                             <div className="card border-0 shadow">
//                                 <img src="Gallery/image/pic5.jpg" alt="" className="card-img-top" />
//                                 <div className="card-body">
//                                     <h4>Car Cleaning</h4>
//                                 </div>
//                             </div>
//                         </div>
//                     <OwlCarousel2>
//                 </div>
//             </div>
//         </section>
//     );
// };


// // Slide Container
// const SlideContainer = styled.div`
//   display: flex;
//   transition: transform 0.5s ease-in-out;
//   transform: translateX(${props => props.translate}px);
// `;

// // Slide
// const Slide = styled.div`
//   min-width: 100%;
//   box-sizing: border-box;
// `;

// // Navigation Buttons
// const NavButton = styled.button`
//   position: absolute;
//   top: 50%;
//   transform: translateY(-50%);
//   background-color: rgba(0, 0, 0, 0.5);
//   color: white;
//   border: none;
//   padding: 10px;
//   cursor: pointer;
//   z-index: 1;
  
//   &:first-of-type {
//     left: 10px;
//   }
  
//   &:last-of-type {
//     right: 10px;
//   }
// `;

// const Carousel = ({ slides }) => {
//   const [currentIndex, setCurrentIndex] = useState(0);

//   const goToNext = () => {
//     setCurrentIndex((prevIndex) => (prevIndex + 1) % slides.length);
//   };

//   const goToPrev = () => {
//     setCurrentIndex((prevIndex) =>
//       (prevIndex - 1 + slides.length) % slides.length
//     );
//   };

//   return (
//     <CarouselContainer>
//       <SlideContainer translate={-currentIndex * 100}>
//         {slides.map((slide, index) => (
//           <Slide key={index}>
//             <img src={slide} alt={`Slide ${index + 1}`} style={{ width: '100%' }} />
//           </Slide>
//         ))}
//       </SlideContainer>
//       <NavButton onClick={goToPrev}>‹</NavButton>
//       <NavButton onClick={goToNext}>›</NavButton>
//     </CarouselContainer>
//   );
// };

// export default Gallery;
