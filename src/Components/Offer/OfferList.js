// src/components/OfferList.js
import React from 'react';
import Offer from './Offer';
import PropTypes from 'prop-types';

const OfferList = ({ offers }) => {
    return (
        <div className="offer-list">
            {offers.map(offer => (
                <Offer
                    key={offer.id}
                    id={offer.id}
                    name={offer.name}
                    description={offer.description}
                    start={offer.start}
                    end={offer.end}
                />
            ))}
        </div>
    );
};

OfferList.propTypes = {
    offers: PropTypes.arrayOf(PropTypes.shape({
        id: PropTypes.string.isRequired,
        name: PropTypes.string.isRequired,
        description: PropTypes.string.isRequired,
        start: PropTypes.string.isRequired,
        end: PropTypes.string.isRequired,
    })).isRequired,
};

export default OfferList;
