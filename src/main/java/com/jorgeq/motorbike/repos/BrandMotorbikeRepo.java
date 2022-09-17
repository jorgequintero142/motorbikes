package com.jorgeq.motorbike.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jorgeq.motorbike.model.BrandMotorbike;

@Repository
public interface BrandMotorbikeRepo extends CrudRepository<BrandMotorbike, Integer>{

}
