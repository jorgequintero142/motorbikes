package com.jorgeq.motorbike.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jorgeq.motorbike.model.MotorBike;

@Service
public class MotorbikeService {
	public List<MotorBike> getAll() {
		List<MotorBike> listMotorBike = new ArrayList<MotorBike>();
		MotorBike mb = new MotorBike(1L, "", null, null);
		listMotorBike.add(mb);
		return listMotorBike;
	}
}
