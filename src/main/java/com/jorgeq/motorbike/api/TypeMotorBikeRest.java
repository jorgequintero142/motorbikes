package com.jorgeq.motorbike.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorgeq.motorbike.model.TypeMotorBike;
import com.jorgeq.motorbike.service.TypeMotorBikeService;

@RestController
@RequestMapping("api/v1/type")
public class TypeMotorBikeRest {

	@Autowired
	private TypeMotorBikeService typeMotorBikeService;


	@GetMapping("getAll")
	public List<TypeMotorBike> getAll() {
		return typeMotorBikeService.getAll();
	}

	@GetMapping("get/{id}")
	public void get(Integer id) {

	}
}
