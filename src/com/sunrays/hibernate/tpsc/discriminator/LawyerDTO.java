package com.sunrays.hibernate.tpsc.discriminator;

public class LawyerDTO extends PersonDTO {
	private Integer noOfCases;
	private String currentClient;
	private Double winPerc;

	public Integer getNoOfCases() {
		return noOfCases;
	}

	public void setNoOfCases(Integer noOfCases) {
		this.noOfCases = noOfCases;
	}

	public String getCurrentClient() {
		return currentClient;
	}

	public void setCurrentClient(String currentClient) {
		this.currentClient = currentClient;
	}

	public Double getWinPerc() {
		return winPerc;
	}

	public void setWinPerc(Double winPerc) {
		this.winPerc = winPerc;
	}

}