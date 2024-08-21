// src/components/NotificationList.js
import React from 'react';
import Notification from './Notification';
import PropTypes from 'prop-types';
import './Notification.css';

const NotificationList = ({ notifications }) => {
    return (
        <div className="notification-list">
            {notifications.map(notification => (
                <Notification
                    key={notification.id}
                    id={notification.id}
                    title={notification.title}
                    message={notification.message}
                    createdAt={notification.createdAt}
                    isRead={notification.isRead}
                />
            ))}
        </div>
    );
};

NotificationList.propTypes = {
    notifications: PropTypes.arrayOf(PropTypes.shape({
        id: PropTypes.string.isRequired,
        title: PropTypes.string.isRequired,
        message: PropTypes.string.isRequired,
        createdAt: PropTypes.string.isRequired,
        isRead: PropTypes.bool.isRequired,
    })).isRequired,
};

export default NotificationList;
