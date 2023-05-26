package MyPack.VehicleInsuranceSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyPack.VehicleInsuranceSystem.DAO.InsuranceDao;
import MyPack.VehicleInsuranceSystem.Entities.Insurance;
@Service
public class InsuranceServiceImpl implements InsuranceService {
@Autowired
private InsuranceDao insuranceDao;
	@Override
	public List<Insurance> getInsurance() {
		// TODO Auto-generated method stub
		return  insuranceDao.findAll();
	}

	@Override
	public Insurance getInsurance(long insuranceCode) {
		// TODO Auto-generated method stub
		return insuranceDao.getOne(insuranceCode);
	}

	@Override
	public Insurance addInsurance(Insurance isurance) {
		// TODO Auto-generated method stub
		insuranceDao.save(isurance);
		return isurance;
	}

	@Override
	public Insurance updateInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
	
		insuranceDao.save(insurance);
		return insurance;
	}

	@Override
	public void deleteInsurance(long parseLong) {
		// TODO Auto-generated method stub
		Insurance entity=insuranceDao.getOne(parseLong);
		insuranceDao.delete(entity);
	}

}
