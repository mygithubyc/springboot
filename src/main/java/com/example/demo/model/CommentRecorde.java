/**
 * 
 */
package com.example.demo.model;

/**
 * File： CommentRecorde.java<br>
 * Title: <br>
 * Description: <br>
 * Company: <br>
 * @author 
 * @version
 */
public class CommentRecorde {

	private Integer commentId;
	
	private Integer articleId;
	
	private Integer answererId;
	
	private Integer respondentId;
	
	private String commentContent;
	
	private String commentDate;
	
	private Integer likes;
	
	private Integer unlikes;
	
	private Integer isRead;

	/**
	 * @return  Integer commentId <br>
	 */
	public Integer getCommentId() {
		return commentId;
	}

	/**
	 * @param commentId <br>
	 */
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	/**
	 * @return  Integer articleId <br>
	 */
	public Integer getArticleId() {
		return articleId;
	}

	/**
	 * @param articleId <br>
	 */
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	/**
	 * @return  Integer answererId <br>
	 */
	public Integer getAnswererId() {
		return answererId;
	}

	/**
	 * @param answererId <br>
	 */
	public void setAnswererId(Integer answererId) {
		this.answererId = answererId;
	}

	/**
	 * @return  Integer respondentId 回复者ID<br>
	 */
	public Integer getRespondentId() {
		return respondentId;
	}

	/**
	 * @param respondentId <br>
	 */
	public void setRespondentId(Integer respondentId) {
		this.respondentId = respondentId;
	}

	/**
	 * @return  String commentContent <br>
	 */
	public String getCommentContent() {
		return commentContent;
	}

	/**
	 * @param commentContent <br>
	 */
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	/**
	 * @return  String commentDate <br>
	 */
	public String getCommentDate() {
		return commentDate;
	}

	/**
	 * @param commentDate <br>
	 */
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}

	/**
	 * @return  Integer likes <br>
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
	 * @return  Integer unlikes <br>
	 */
	public Integer getUnlikes() {
		return unlikes;
	}

	/**
	 * @param unlikes <br>
	 */
	public void setUnlikes(Integer unlikes) {
		this.unlikes = unlikes;
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
