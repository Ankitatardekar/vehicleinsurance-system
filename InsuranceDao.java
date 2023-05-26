package MyPack.VehicleInsuranceSystem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import MyPack.VehicleInsuranceSystem.Entities.Insurance;

public interface InsuranceDao extends JpaRepository<Insurance, Long> {

}
