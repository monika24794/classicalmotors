// src/components/Invoice.js
import React from 'react';
import PropTypes from 'prop-types';
import './Invoice.css';

const Invoice = ({ id, number, status, totalAmount, issued }) => {
    return (
        <div className={`invoice ${status}`}>
            <h3>Invoice #{number}</h3>
            <p><strong>ID:</strong> {id}</p>
            <p><strong>Status:</strong> {status}</p>
            <p><strong>Total Amount:</strong> ${totalAmount.toFixed(2)}</p>
            <p><strong>Issued Date:</strong> {new Date(issued).toLocaleDateString()}</p>
            <hr />
        </div>
    );
};

Invoice.propTypes = {
    id: PropTypes.string.isRequired,
    number: PropTypes.string.isRequired,
    status: PropTypes.string.isRequired,
    totalAmount: PropTypes.number.isRequired,
    issued: PropTypes.string.isRequired,
};

export default Invoice;
