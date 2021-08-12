
package com.capeelectric.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capeelectric.VO.ResponseTemplateVO;
import com.capeelectric.VO.User;
import com.capeelectric.exception.InstalReportException;
import com.capeelectric.model.ReportDetails;
import com.capeelectric.repository.InstalReportDetailsRepository;
import com.capeelectric.service.InstalReportService;

/**
 * This InstalReportServiceImpl service class doing save and retrieve operation related to ReportDetails
 * @author capeelectricsoftware
 *
 */
@Service
public class InstalReportServiceImpl implements InstalReportService {

	@Autowired
	private InstalReportDetailsRepository installationReportRepository;

//	@Autowired
//	private UserRepository userRepository;
	
	@Autowired
    private RestTemplate restTemplate;

	/**
	 * @param ReportDetails
	 * addInstallationReport method to will be save ReportDetails object
	 * 
	*/
	@Override
	public void addInstallationReport(ReportDetails reportDetails) throws InstalReportException {
		if (reportDetails != null && reportDetails.getUserName() != null && reportDetails.getSiteId() != null) {
			Optional<ReportDetails> reportDetailsRepo = installationReportRepository
					.findBySiteId(reportDetails.getSiteId());
			if (!reportDetailsRepo.isPresent()
					|| !reportDetailsRepo.get().getSiteId().equals(reportDetails.getSiteId())) {
				reportDetails.setCreatedDate(LocalDateTime.now());
				reportDetails.setCreatedBy(generateFullName(reportDetails.getUserName(),reportDetails.getReportId()));
				installationReportRepository.save(reportDetails);
			} else {
				throw new InstalReportException("SiteId already present");
			}

		} else {
			throw new InstalReportException("invalid inputs");
		}
	}

	/**
	 * @param userName
	 * retrieveInstallationReport method to will be save retrieve object based on userName
	 * 
	*/
	@Override
	public List<ReportDetails> retrieveInstallationReport(String userName,Integer siteId) throws InstalReportException {
		if (userName != null) {

			return installationReportRepository.findByUserNameAndSiteId(userName,siteId);

		} else {
			throw new InstalReportException("invalid inputs");
		}
	}

	/**
	 * Method to return Full Name based on UserName
	 * @param userName
	 * @return
	 */
	private String generateFullName(String userName,Integer reportId ) throws InstalReportException {
		
//		Optional<User> user = userRepository.findByUsername(userName);
//		if (user.isPresent() && user.get() != null)
//			return user.get().getFirstname() + " " + user.get().getLastname();
//		return "";
		
		ResponseTemplateVO vo = new ResponseTemplateVO();
		ReportDetails report = installationReportRepository.findByReportId(reportId);

        User user = 
        		restTemplate.getForObject("http://LV-INSPECTION/api/v1/" + report.getUserName()
                        ,User.class);
       
        vo.setUser(user);
        vo.setReportDetails(report);
        
			if (user.isUserexist() && user.getEmail() != null)
				return user.getFirstname() + " " + user.getLastname();
			return "";
		}
	
}
