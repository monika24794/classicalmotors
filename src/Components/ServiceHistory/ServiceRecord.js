// src/components/ServiceRecord.js
import React from 'react';
import PropTypes from 'prop-types';
import './ServiceHistory.css';

const ServiceRecord = ({ id, title, message, createdAt, isRead, users }) => {
    return (
        <div className={`service-record ${isRead ? 'read' : 'unread'}`} key={id}>
            <h2>{title}</h2>
            <p>{message}</p>
            <small>Created At: {new Date(createdAt).toLocaleString()}</small>
            <div className="service-record-users">
                <strong>Users:</strong>
                <ul>
                    {users.map(user => (
                        <li key={user}>{user}</li>
                    ))}
                </ul>
            </div>
            <hr />
        </div>
    );
};

ServiceRecord.propTypes = {
    id: PropTypes.string.isRequired,
    title: PropTypes.string.isRequired,
    message: PropTypes.string.isRequired,
    createdAt: PropTypes.string.isRequired,
    isRead: PropTypes.bool.isRequired,
    users: PropTypes.arrayOf(PropTypes.string).isRequired,
};

export default ServiceRecord;
