package com.jorgeq.motorbike.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorgeq.motorbike.model.TypeMotorBike;
import com.jorgeq.motorbike.repos.TypeMotorBikeRepo;

@Service
public class TypeMotorBikeService {
	@Autowired
	private TypeMotorBikeRepo repo;
	
	public List<TypeMotorBike> getAll() {
		return (List<TypeMotorBike>) repo.findAll();
	}
}
