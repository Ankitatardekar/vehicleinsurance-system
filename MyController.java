package MyPack.VehicleInsuranceSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import MyPack.VehicleInsuranceSystem.Entities.Insurance;
import MyPack.VehicleInsuranceSystem.Services.InsuranceService;

//package MyPack.VehicleInsuranceSystem.Controller;
@RestController
@CrossOrigin(allowedHeaders = "*")
public class MyController {
	@Autowired
	private InsuranceService insuranceService;

	@GetMapping("/home")
	public String Home() {
		return "Welcome to Vehicle Insurance System";
	}

//get all the insurance using GET Request
	@GetMapping("/insurance")
	public List<Insurance> getInsurance() {
		return this.insuranceService.getInsurance();
	}

//get single insurance using GET Request
	@GetMapping("/insurance/{insuranceId}")
	public Insurance getInsurance(@PathVariable String insuranceId) {
		return this.insuranceService.getInsurance(Long.parseLong(insuranceId));
	}

//add insurance using POST Request
	@PostMapping("/insurance")
	public Insurance addInsurance(@RequestBody Insurance insurance) {
		return this.insuranceService.addInsurance(insurance);

	}

//update Insurance using PUT Request
	@PutMapping("/insurance")
	public Insurance updateInsurance(@RequestBody Insurance insurance) {
		return this.insuranceService.updateInsurance(insurance);
	}

//Delete the Insurance using DELETE Request
	@DeleteMapping("/insurance/{insuranceId}")
	public void deleteInsurance(@PathVariable String insuranceId) {
		this.insuranceService.deleteInsurance(Long.parseLong(insuranceId));
	}

}
