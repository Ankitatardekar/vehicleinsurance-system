package MyPack.VehicleInsuranceSystem.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Insurance {
@Id
private long id;
private String userName;
private String planOption;
private String insuranceType;
private double premium;
public String getPlanOption() {
	return planOption;
}
public void setPlanOption(String planOption) {
	this.planOption = planOption;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getInsuranceType() {
	return insuranceType;
}
public void setInsuranceType(String insuranceType) {
	this.insuranceType = insuranceType;
}
public double getPremium() {
	return premium;
}
public void setPremium(double premium) {
	this.premium = premium;
}
public Insurance() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Insurance [id=" + id + ", userName=" + userName + ", planOption=" + planOption + ", insuranceType="
			+ insuranceType + ", premium=" + premium + "]";
}


}
