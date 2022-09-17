package com.jorgeq.motorbike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorgeq.motorbike.model.BrandMotorbike;
import com.jorgeq.motorbike.repos.BrandMotorbikeRepo;

@Service
public class BrandMotorbikeService {

	@Autowired
	private BrandMotorbikeRepo repository;

	public List<BrandMotorbike> getAll() {
		return (List<BrandMotorbike>) repository.findAll();
	}
}
