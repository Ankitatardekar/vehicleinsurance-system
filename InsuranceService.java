package MyPack.VehicleInsuranceSystem.Services;

import java.util.List;

import MyPack.VehicleInsuranceSystem.Entities.Insurance;



public interface InsuranceService {
	public List<Insurance> getInsurance();
	public Insurance getInsurance(long insuranceCode);
	public Insurance addInsurance(Insurance isurance);
	public Insurance updateInsurance(Insurance insurance);
	public void deleteInsurance(long parseLong);
}
