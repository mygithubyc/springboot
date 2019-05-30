/**
 * 
 */
package com.example.demo.model;

/**
 * File： UserInfo.java<br>
 * Title: <br>
 * Description: 对应mysql里面 blog_hub_db的 USER_INFO表<br>
 * Company: <br>
 * 
 * @author
 * @version
 */
public class UserInfo {

	private Integer userId;

	private String userName;

	private String password;

	private String email;

	private String trueName;

	private String bairthday;

	private String gender;

	private String avatarImgUrl;

	private String phoneNum;

	private String personalBrief;

	/**
	 * @return Integer userId 用户ID<br>
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            用户ID<br>
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return String userName 用户名<br>
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            <br>
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return String password <br>
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            <br>
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return String email <br>
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            <br>
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return String trueName 真实姓名<br>
	 */
	public String getTrueName() {
		return trueName;
	}

	/**
	 * @param trueName
	 *            <br>
	 */
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	/**
	 * @return String bairthday <br>
	 */
	public String getBairthday() {
		return bairthday;
	}

	/**
	 * @param bairthday
	 *            <br>
	 */
	public void setBairthday(String bairthday) {
		this.bairthday = bairthday;
	}

	/**
	 * @return String gender <br>
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            性别<br>
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return String avatarImgUrl <br>
	 */
	public String getAvatarImgUrl() {
		return avatarImgUrl;
	}

	/**
	 * @param avatarImgUrl
	 *            <br>
	 */
	public void setAvatarImgUrl(String avatarImgUrl) {
		this.avatarImgUrl = avatarImgUrl;
	}

	/**
	 * @return String phoneNum <br>
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum
	 *            <br>
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * @return String personalBrief <br>
	 */
	public String getPersonalBrief() {
		return personalBrief;
	}

	/**
	 * @param personalBrief
	 *            <br>
	 */
	public void setPersonalBrief(String personalBrief) {
		this.personalBrief = personalBrief;
	}

}
