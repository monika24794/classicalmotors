import React from 'react'
import './Services.css';
import logo1 from "./modern-automobile-mechanic-composition.jpg";
import logo2 from "./Repair & Maintenance.jpg";
import logo3 from "./AC Repair.jpg";
import logo4 from "./Battery.jpg";
import logo5 from "./RepaireMain.jpg";
import logo6 from "./Electrical Repair.jpg";
import logo7 from "./Break.jpg";
import logo8 from "./Engine Repair.jpg";
import logo9 from "./Auto Detaling.jpg"
import logo10 from "./Suspention Repair.jpg";
import logo11 from "./Painting.jpg";
import logo12 from "./Diagonostic Service.jpg";


export default function services
    () {
    return (
        <section class="services" id="services">
            <div class="container">
                <div class="row headings">
                    <div class="section-title"><h2>Services</h2></div>
                </div>
                <div class="row mbr-justify-content-center">

                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo1} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">Oil Change</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>An oil change service involves draining old engine oil, replacing it with fresh oil, and changing the oil filter.
                                    It's crucial for engine health, as clean oil lubricates engine components, reduces friction,and prevents wear. Mechanics also
                                    inspect vehicle for leaks, check other fluids, and may perform basic maintenance tasks. It optimises fuel efficiency.</p>
                            </div>
                            <div class="clearfix"></div>
                            {/* <div class="w-100 px-3">
                                <a class="more-info" href="/interior_deep_cleaning">
                                    More <i class="fa fa-arrow-right"></i>
                                </a>
                            </div> */}
                        </div>
                    </div>
                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo2} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left"> Repair & Main.</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>General repair and maintenance service in a garage encompasses a wide range of tasks aimed at keeping vehicles in optimal condition.
                                    Technicians conduct routine inspections, fluid checks, and part replacements to ensure safety and performance. This includes oil changes,
                                    brake inspections, tire rotations, and fluid top-ups.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo3} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">Air Conditioning</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>Contains inspection and the repairing with maintaining vehicle HVAC systems to ensure that the efficient cooling and heating. Technicians use diagnostic tools to identify leaks, worn components, or refrigerant levels. They may perform  the repairs such as fixing  the leaks and with replacing worn hoses, or repairing the compressor.</p>
                            </div>
                        </div>
                    </div>
                    {/*   <div class="col-lg-4 mbr-col-md-10">
                   <div class="wrap">
                       <div class="w-100 mb-5 p-2">
                           <div class="pull-left"><img src="/img/icons-03.png" class="iconimg"></div>
                           <h2 class="mbr-bold display-5 pull-left">Car Paint Protection</h2>
                       </div>
                       <div class="clearfix"></div>
                       <div class="w-100 px-3">
                           <p>In this service we do complete car exterior detailing with use of 3 step polishing action. It is a more conventional method with the use of a rotary machine. Additional polymer coating can be opted after this service for more protection.</p>
                       </div>
                   </div>
               </div> */}
                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo4} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">Battery</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>Addressing the inspection, testing, maintaining vehicle batteries to ensure optimal performance and longevity. Mechanics check battery voltage, connections, electrolyte levels, cleaning terminals and cables as needed. They may also recharge or replace batteries if necessary and using the specialized equipment.</p>
                            </div>
                            <div class="clearfix"></div>
                            {/* <div class="w-100 px-3">
                                <a class="more-info" href="/ceramic_or_graphene_coating">
                                    More <i class="fa fa-arrow-right"></i>
                                </a>
                            </div> */}
                        </div>
                    </div>
                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo5} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">A/C Services</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>A/C service involves diagnosing, repairing, and maintaining vehicle's air conditioning system to ensure efficient cooling and comfort. Technicians inspect components such as the compressor, condenser, evaporator, refrigerant lines for leaks, damage, or wear. They may recharge refrigerant, replace worn parts, or repair leaks to restore proper system function.</p>
                            </div>
                            <div class="clearfix"></div>
                            {/*   <div class="w-100 px-3">
                           <a class="more-info" href="/ceramic_or_graphene_coating">
                             More <i class="fa fa-arrow-right"></i>
                           </a>
                       </div> */}
                        </div>
                    </div>

                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo6} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">Electrical Repair</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>Electrical repairing are diagnosed, fixing issues affecting vehicle's electrical system. Technicians use diagnostic tools to identify problems such as wiring, malfunctioning sensors, or electrical component failures. They repair, replace damaged parts, ensuring proper connections and functionality. It enhances safety, overall experience for vehicle owners.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo7} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">Brakes</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>The service includes maintaining braking systems for optimal performance and safety with inspection. Mechanics assess brake pads, rotors, calipers, and brake fluid levels for wear and damage. They may replace worn components, resurface rotors, or flush and refill brake fluid as needed.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo8} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">Engine Repair</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>Engine repairs diagnosing and fixing issues affecting the engine's performance. Mechanics use diagnostic tools to pinpoint problems such as overheating, misfires, strange noises. Repairs include replacing damaged components like hoses, or gaskets, rebuilding engine or addressing issues with ignition system.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo9} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">Auto Detailing</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>Auto detailing service in a garage involves thorough cleaning, restoration, finishing of a vehicle's interior and exterior surfaces. Technicians meticulously clean exterior, removing dirt, grime, and contaminants with techniques like washing, claying, and polishing. Provides refreshed, pristine driving environment for owners.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo10} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">Suspention Repair</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p> Involves diagnosing and fixing issues with a vehicle's suspension system, which includes components like shocks, struts, springs, and control arms. r damaged bushings. Repair typically includes inspecting these parts, replacing worn components, and ensuring proper alignment to restore ride comfort and handling.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo11} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">Painting</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>Involving refinishing vehicle exteriors to restore or enhance their appearance. Skilled technicians prepare surfaces by sanding, filling, and priming to ensure smoothness and adhesion. They use high-quality paints, matched to the vehicle's original color or customized preferences, applying them evenly with professional spray equipment.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 mbr-col-md-10">
                        <div class="wrap">
                            <div class="w-100 mb-5 p-2">
                                <div class="pull-left"><img src={logo12} class="iconimg" /></div>
                                <h2 class="mbr-bold display-5 pull-left">Diagnostic Service</h2>
                            </div>
                            <div class="clearfix"></div>
                            <div class="w-100 px-3">
                                <p>Vehicle diagnostic service in garage involves using advanced tools and techniques to identify performance. Technicians connect diagnostic equipment to vehicle's onboard computer system to retrieve error codes and data. They analyze information to pinpoint root cause of problems such as engine misfires, electrical faults, or sensor malfunctions.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    )
}
