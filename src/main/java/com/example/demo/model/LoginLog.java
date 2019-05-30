/**
 * 
 */
package com.example.demo.model;

/**
 * File： LoginLog.java<br>
 * Title: <br>
 * Description: <br>
 * Company: <br>
 * 
 * @author
 * @version
 */
public class LoginLog {

	private String userName;

	private String siginTime;

	private String siginLand;

	private String siginIp;

	private String sigoutTime;

	/**
	 * @return String userName <br>
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
	 * @return String siginTime 登录时间<br>
	 */
	public String getSiginTime() {
		return siginTime;
	}

	/**
	 * @param siginTime
	 *            <br>
	 */
	public void setSiginTime(String siginTime) {
		this.siginTime = siginTime;
	}

	/**
	 * @return String siginLand <br>
	 */
	public String getSiginLand() {
		return siginLand;
	}

	/**
	 * @param siginLand
	 *            登录地<br>
	 */
	public void setSiginLand(String siginLand) {
		this.siginLand = siginLand;
	}

	/**
	 * @return String siginIp <br>
	 */
	public String getSiginIp() {
		return siginIp;
	}

	/**
	 * @param siginIp
	 *            <br>
	 */
	public void setSiginIp(String siginIp) {
		this.siginIp = siginIp;
	}

	/**
	 * @return String sigoutTime 退出时间<br>
	 */
	public String getSigoutTime() {
		return sigoutTime;
	}

	/**
	 * @param sigoutTime
	 *            <br>
	 */
	public void setSigoutTime(String sigoutTime) {
		this.sigoutTime = sigoutTime;
	}

}
