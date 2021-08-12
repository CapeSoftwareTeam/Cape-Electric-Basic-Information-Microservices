package com.capeelectric.VO;

import com.capeelectric.model.ReportDetails;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	private Site site;
	private ReportDetails reportDetails;
	private User user;
	
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	
	public ReportDetails getReportDetails() {
		return reportDetails;
	}
	public void setReportDetails(ReportDetails reportDetails) {
		this.reportDetails = reportDetails;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
