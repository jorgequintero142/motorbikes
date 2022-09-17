package com.jorgeq.motorbike.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorgeq.motorbike.model.MotorBike;
import com.jorgeq.motorbike.service.MotorbikeService;

@RestController
@RequestMapping("api/v1/motorbike")
public class MotorBikeRest {
	
	private final MotorbikeService motorbikeService;
	
	public MotorBikeRest(MotorbikeService motorbikeService) {
		this.motorbikeService = motorbikeService;
	}
	@GetMapping("getAll")
	public List<MotorBike> getAll() {
		return motorbikeService.getAll();		
	}
	
	@GetMapping("get/{id}")
	public MotorBike get(Long idMotorBike) {
		return new MotorBike(0L, null, null, null);
	}
	
	@PostMapping("add")
	public void add(MotorBike motorbike) {
		
	}
}
