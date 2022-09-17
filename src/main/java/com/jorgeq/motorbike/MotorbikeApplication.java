package com.jorgeq.motorbike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jorgeq.motorbike.model.BrandMotorbike;
import com.jorgeq.motorbike.model.TypeMotorBike;
import com.jorgeq.motorbike.repos.BrandMotorbikeRepo;
import com.jorgeq.motorbike.repos.TypeMotorBikeRepo;

@SpringBootApplication
public class MotorbikeApplication implements CommandLineRunner {

	@Autowired
	private TypeMotorBikeRepo typeMotorbikeRepository;

	@Autowired
	private BrandMotorbikeRepo brandMotorbikeRpository;

	public static void main(String[] args) {
		SpringApplication.run(MotorbikeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		typeMotorbikeRepository.save(new TypeMotorBike("Street"));
		typeMotorbikeRepository.save(new TypeMotorBike("Adventure"));
		typeMotorbikeRepository.save(new TypeMotorBike("Off road"));
		typeMotorbikeRepository.save(new TypeMotorBike("Race"));
		typeMotorbikeRepository.save(new TypeMotorBike("Sport"));

		brandMotorbikeRpository.save(new BrandMotorbike("Honda"));
		brandMotorbikeRpository.save(new BrandMotorbike("Yamaha"));
		brandMotorbikeRpository.save(new BrandMotorbike("Suzuki"));
		brandMotorbikeRpository.save(new BrandMotorbike("Kawasaki"));

	}
}