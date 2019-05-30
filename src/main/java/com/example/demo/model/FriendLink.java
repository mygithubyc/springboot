/**
 * 
 */
package com.example.demo.model;

/**
 * File： FriendLink.java<br>
 * Title: <br>
 * Description: 友情链接<br>
 * Company: <br>
 * @author 
 * @version
 */
public class FriendLink {

	private Integer linkId;
	
	private String bloger;
	
	private String linkUrl;

	/**
	 * @return  Integer linkId <br>
	 */
	public Integer getLinkId() {
		return linkId;
	}

	/**
	 * @param linkId <br>
	 */
	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	/**
	 * @return  String bloger <br>
	 */
	public String getBloger() {
		return bloger;
	}

	/**
	 * @param bloger 博主<br>
	 */
	public void setBloger(String bloger) {
		this.bloger = bloger;
	}

	/**
	 * @return  String linkUrl <br>
	 */
	public String getLinkUrl() {
		return linkUrl;
	}

	/**
	 * @param linkUrl <br>
	 */
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	
	
}
