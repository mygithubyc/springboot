/**
 * 
 */
package com.example.demo.model;

/**
 * File： LeaveMessageLikeRecorde.java<br>
 * Title: <br>
 * Description: 留言消息收藏<br>
 * Company: <br>
 * @author 
 * @version
 */
public class LeaveMessageLikeRecorde {

	private Integer leaveMsgLikeId;
	
	private String likeUser;
	
	private String likeDate;

	/**
	 * @return  Integer leaveMsgLikeId <br>
	 */
	public Integer getLeaveMsgLikeId() {
		return leaveMsgLikeId;
	}

	/**
	 * @param leaveMsgLikeId <br>
	 */
	public void setLeaveMsgLikeId(Integer leaveMsgLikeId) {
		this.leaveMsgLikeId = leaveMsgLikeId;
	}

	/**
	 * @return  String likeUser <br>
	 */
	public String getLikeUser() {
		return likeUser;
	}

	/**
	 * @param likeUser 收藏用户<br>
	 */
	public void setLikeUser(String likeUser) {
		this.likeUser = likeUser;
	}

	/**
	 * @return  String likeDate <br>
	 */
	public String getLikeDate() {
		return likeDate;
	}

	/**
	 * @param likeDate <br>
	 */
	public void setLikeDate(String likeDate) {
		this.likeDate = likeDate;
	}
	
	
}
