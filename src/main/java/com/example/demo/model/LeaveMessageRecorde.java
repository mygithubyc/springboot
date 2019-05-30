/**
 * 
 */
package com.example.demo.model;

/**
 * File： LeaveMessageRecorde.java<br>
 * Title: <br>
 * Description: 留言记录<br>
 * Company: <br>
 * @author 
 * @version
 */
public class LeaveMessageRecorde {

	private Integer leaveMsgId;
	
	private String answererUser;
	
	private String respondentUser;
	
	private String leaveMsgDate;
	
	private Integer likes;
	
	private String leaveMsgContent;
	
	private Integer isRead;

	/**
	 * @return  Integer leaveMsgId <br>
	 */
	public Integer getLeaveMsgId() {
		return leaveMsgId;
	}

	/**
	 * @param leaveMsgId <br>
	 */
	public void setLeaveMsgId(Integer leaveMsgId) {
		this.leaveMsgId = leaveMsgId;
	}

	/**
	 * @return  String answererUser <br>
	 */
	public String getAnswererUser() {
		return answererUser;
	}

	/**
	 * @param answererUser <br>
	 */
	public void setAnswererUser(String answererUser) {
		this.answererUser = answererUser;
	}

	/**
	 * @return  String respondentUser <br>
	 */
	public String getRespondentUser() {
		return respondentUser;
	}

	/**
	 * @param respondentUser <br>
	 */
	public void setRespondentUser(String respondentUser) {
		this.respondentUser = respondentUser;
	}

	/**
	 * @return  String leaveMsgDate 留言日期<br>
	 */
	public String getLeaveMsgDate() {
		return leaveMsgDate;
	}

	/**
	 * @param leaveMsgDate <br>
	 */
	public void setLeaveMsgDate(String leaveMsgDate) {
		this.leaveMsgDate = leaveMsgDate;
	}

	/**
	 * @return  Integer likes 点赞数<br>
	 */
	public Integer getLikes() {
		return likes;
	}

	/**
	 * @param likes <br>
	 */
	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	/**
	 * @return  String leaveMsgContent <br>
	 */
	public String getLeaveMsgContent() {
		return leaveMsgContent;
	}

	/**
	 * @param leaveMsgContent 留言消息内容<br>
	 */
	public void setLeaveMsgContent(String leaveMsgContent) {
		this.leaveMsgContent = leaveMsgContent;
	}

	/**
	 * @return  Integer isRead <br>
	 */
	public Integer getIsRead() {
		return isRead;
	}

	/**
	 * @param isRead <br>
	 */
	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}
	
	
}
