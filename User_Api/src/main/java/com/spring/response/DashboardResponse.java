package com.spring.response;

public class DashboardResponse {

	private Long plansCount;
	
	private Long citizensApCnt;
	
	private Long citizenDnCnt;
	
	private Double benefitAmtTotal;

	public Long getPlansCount() {
		return plansCount;
	}

	public void setPlansCount(Long plansCount) {
		this.plansCount = plansCount;
	}

	public Long getCitizensApCnt() {
		return citizensApCnt;
	}

	public void setCitizensApCnt(Long citizensApCnt) {
		this.citizensApCnt = citizensApCnt;
	}

	public Long getCitizenDnCnt() {
		return citizenDnCnt;
	}

	public void setCitizenDnCnt(Long citizenDnCnt) {
		this.citizenDnCnt = citizenDnCnt;
	}

	public Double getBenefitAmtTotal() {
		return benefitAmtTotal;
	}

	public void setBenefitAmtTotal(Double benefitAmtTotal) {
		this.benefitAmtTotal = benefitAmtTotal;
	}
	
	
	
	
}
