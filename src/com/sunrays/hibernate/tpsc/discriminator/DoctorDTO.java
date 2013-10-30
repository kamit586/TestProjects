package com.sunrays.hibernate.tpsc.discriminator;

public class DoctorDTO extends PersonDTO {
	private Integer noOfSurgeries;
	private String hospitalAddress;
	private String specialization;

	public Integer getNoOfSurgeries() {
		return noOfSurgeries;
	}

	public void setNoOfSurgeries(Integer noOfSurgeries) {
		this.noOfSurgeries = noOfSurgeries;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
}