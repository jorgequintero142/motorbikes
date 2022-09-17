package com.jorgeq.motorbike.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jorgeq.motorbike.model.TypeMotorBike;

@Repository
public interface TypeMotorBikeRepo extends CrudRepository<TypeMotorBike, Integer> {

}
