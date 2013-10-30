package com.sunrays.hibernate.tpsc.discriminator;

public class EngineerDTO extends PersonDTO {
	private Integer noOfProjects;
	private String companyId;

	public Integer getNoOfProjects() {
		return noOfProjects;
	}

	public void setNoOfProjects(Integer noOfProjects) {
		this.noOfProjects = noOfProjects;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
}