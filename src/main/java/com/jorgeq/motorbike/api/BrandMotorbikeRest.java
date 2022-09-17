package com.jorgeq.motorbike.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorgeq.motorbike.model.BrandMotorbike;
import com.jorgeq.motorbike.service.BrandMotorbikeService;

@RestController
@RequestMapping("api/v1/brand")
public class BrandMotorbikeRest {

	// private final BrandMotorbikeService brandMotorbikeService;

	private BrandMotorbikeService brandMotorbikeService;

	@Autowired
	public void setBrandMotorbikeService(BrandMotorbikeService brandMotorbikeService) {
		this.brandMotorbikeService = brandMotorbikeService;
	}

	@GetMapping("getAll")
	public List<BrandMotorbike> getAll() {
		return brandMotorbikeService.getAll();
	}

	public void get() {
		// TODO Auto-generated method stub

	}

}
