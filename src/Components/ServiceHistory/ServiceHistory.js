// src/components/ServiceHistory.js
import React from 'react';
import ServiceRecord from './ServiceRecord';
import PropTypes from 'prop-types';

const ServiceHistory = ({ records }) => {
    return (
        <div className="service-history">
            {records.map(record => (
                <ServiceRecord
                    key={record.id}
                    id={record.id}
                    title={record.title}
                    message={record.message}
                    createdAt={record.createdAt}
                    isRead={record.isRead}
                    users={record.users}
                />
            ))}
        </div>
    );
};

ServiceHistory.propTypes = {
    records: PropTypes.arrayOf(PropTypes.shape({
        id: PropTypes.string.isRequired,
        title: PropTypes.string.isRequired,
        message: PropTypes.string.isRequired,
        createdAt: PropTypes.string.isRequired,
        isRead: PropTypes.bool.isRequired,
        users: PropTypes.arrayOf(PropTypes.string).isRequired,
    })).isRequired,
};

export default ServiceHistory;
