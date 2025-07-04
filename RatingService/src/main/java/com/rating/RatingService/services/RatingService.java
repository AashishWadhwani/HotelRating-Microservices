package com.rating.RatingService.services;

import com.rating.RatingService.entities.Rating;
import jakarta.persistence.Id;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    //get all ratings by user id
    List<Rating> getRatingByUserId(String userId);

    //get all ratings by hotel id
    List<Rating> getRatingByHotelId(String hotelId);
}
