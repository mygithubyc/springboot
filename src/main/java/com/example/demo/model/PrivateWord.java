/**
 * 
 */
package com.example.demo.model;

/**
 * File： PrivateWord.java<br>
 * Title: <br>
 * Description: 私信<br>
 * Company: <br>
 * @author 
 * @version
 */
public class PrivateWord {

	private Integer privateWord;
	
	private String privateWordMsg;
	
	private String publisher;
	
	private String replier;
	
	private String replyContent;
	
	private String publishDate;

	/**
	 * @return  Integer privateWord <br>
	 */
	public Integer getPrivateWord() {
		return privateWord;
	}

	/**
	 * @param privateWord <br>
	 */
	public void setPrivateWord(Integer privateWord) {
		this.privateWord = privateWord;
	}

	/**
	 * @return  String privateWordMsg <br>
	 */
	public String getPrivateWordMsg() {
		return privateWordMsg;
	}

	/**
	 * @param privateWordMsg <br>
	 */
	public void setPrivateWordMsg(String privateWordMsg) {
		this.privateWordMsg = privateWordMsg;
	}

	/**
	 * @return  String publisher <br>
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher 发送者<br>
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return  String replier 回复者<br>
	 */
	public String getReplier() {
		return replier;
	}

	/**
	 * @param replier <br>
	 */
	public void setReplier(String replier) {
		this.replier = replier;
	}

	/**
	 * @return  String replyContent 回复内容<br>
	 */
	public String getReplyContent() {
		return replyContent;
	}

	/**
	 * @param replyContent <br>
	 */
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	/**
	 * @return  String publishDate <br>
	 */
	public String getPublishDate() {
		return publishDate;
	}

	/**
	 * @param publishDate <br>
	 */
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	
	
}
