package com.user.service.external.services;

import com.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Map;

@FeignClient(name = "RATINGSERVICE")
public interface RatingService {

    //get

    //post
    @PostMapping("/ratings")
    ResponseEntity<Rating> createRating(Rating values);

    //put
    @PutMapping("/ratings/{ratingId}")
    ResponseEntity<Rating> updateRating(@PathVariable("ratingId") String ratingId, Rating rating);

    //delete
    @DeleteMapping("/ratings/{ratingId}")
    void deleteRating(@PathVariable String ratingId);

}
