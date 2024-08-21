// src/components/InvoiceList.js
import React from 'react';
import Invoice from './Invoice';
import PropTypes from 'prop-types';

const InvoiceList = ({ invoices }) => {
    return (
        <div className="invoice-list">
            {invoices.map(invoice => (
                <Invoice
                    key={invoice.id}
                    id={invoice.id}
                    number={invoice.number}
                    status={invoice.status}
                    totalAmount={invoice.totalAmount}
                    issued={invoice.issued}
                />
            ))}
        </div>
    );
};

InvoiceList.propTypes = {
    invoices: PropTypes.arrayOf(PropTypes.shape({
        id: PropTypes.string.isRequired,
        number: PropTypes.string.isRequired,
        status: PropTypes.string.isRequired,
        totalAmount: PropTypes.number.isRequired,
        issued: PropTypes.string.isRequired,
    })).isRequired,
};

export default InvoiceList;
