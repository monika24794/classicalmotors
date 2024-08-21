
import React from 'react';
import PropTypes from 'prop-types';
import './Notification.css';

const Notification = ({ id, title, message, createdAt, isRead }) => {
    return (
        <div className={`notification ${isRead ? 'read' : 'unread'}`} key={id}>
            <h2>{title}</h2>
            <p>{message}</p>
            <small>{new Date(createdAt).toLocaleString()}</small>
            <hr />
        </div>
    );
};

Notification.propTypes = {
    id: PropTypes.string.isRequired,
    title: PropTypes.string.isRequired,
    message: PropTypes.string.isRequired,
    createdAt: PropTypes.string.isRequired,
    isRead: PropTypes.bool.isRequired,
};

export default Notification;
