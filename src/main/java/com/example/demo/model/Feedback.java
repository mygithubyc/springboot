/**
 * 
 */
package com.example.demo.model;

/**
 * File： Feedback.java<br>
 * Title: <br>
 * Description: 记录用户给管理员反馈信息<br>
 * Company: <br>
 * @author 
 * @version
 */
public class Feedback {

	private Integer feedbackId;
	
	private String feedbackContent;
	
	private String contactInfo;
	
	private Integer personId;
	
	private String feedbackDate;

	/**
	 * @return  Integer feedbackId <br>
	 */
	public Integer getFeedbackId() {
		return feedbackId;
	}

	/**
	 * @param feedbackId <br>
	 */
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	/**
	 * @return  String feedbackContent <br>
	 */
	public String getFeedbackContent() {
		return feedbackContent;
	}

	/**
	 * @param feedbackContent <br>
	 */
	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent = feedbackContent;
	}

	/**
	 * @return  String contactInfo <br>
	 */
	public String getContactInfo() {
		return contactInfo;
	}

	/**
	 * @param contactInfo 反馈人员联系方式<br>
	 */
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	/**
	 * @return  Integer personId 反馈人员ID<br>
	 */
	public Integer getPersonId() {
		return personId;
	}

	/**
	 * @param personId 反馈人员ID<br>
	 */
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	/**
	 * @return  String feedbackDate <br>
	 */
	public String getFeedbackDate() {
		return feedbackDate;
	}

	/**
	 * @param feedbackDate <br>
	 */
	public void setFeedbackDate(String feedbackDate) {
		this.feedbackDate = feedbackDate;
	}
	
	
}
