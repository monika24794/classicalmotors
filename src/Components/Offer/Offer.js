// src/components/Offer.js
import React from 'react';
import PropTypes from 'prop-types';
import './Offer';

const Offer = ({ id, name, description, start, end }) => {
    return (
        <div className="offer" key={id}>
            <h3>{name}</h3>
            <p><strong>Description:</strong> {description}</p>
            <p><strong>Start Date:</strong> {new Date(start).toLocaleDateString()}</p>
            <p><strong>End Date:</strong> {new Date(end).toLocaleDateString()}</p>
            <hr />
        </div>
    );
};

Offer.propTypes = {
    id: PropTypes.string.isRequired,
    name: PropTypes.string.isRequired,
    description: PropTypes.string.isRequired,
    start: PropTypes.string.isRequired,
    end: PropTypes.string.isRequired,
};

export default Offer;
