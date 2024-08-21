// src/mockData.js
export const serviceRecords = [
    {
        id: '1',
        title: 'Service Record 001',
        message: 'Service completed for client A.',
        createdAt: new Date().toISOString(),
        isRead: false,
        users: ['User1', 'User2'],
    },
    {
        id: '2',
        title: 'Service Record 002',
        message: 'Maintenance performed on equipment B.',
        createdAt: new Date().toISOString(),
        isRead: true,
        users: ['User3'],
    },
    // Add more service records as needed
];
