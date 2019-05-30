/**
 * 
 */
package com.example.demo.model;

/**
 * File： CommentLikesRecorde.java<br>
 * Title: <br>
 * Description: <br>
 * Company: <br>
 * @author 
 * @version
 */
public class CommentLikesRecorde {

	private Integer commentLikeId;
	
	private Integer articleId;
	
	private Integer likerId;
	
	private String likeDate;

	/**
	 * @return  Integer commentLikeId <br>
	 */
	public Integer getCommentLikeId() {
		return commentLikeId;
	}

	/**
	 * @param commentLikeId <br>
	 */
	public void setCommentLikeId(Integer commentLikeId) {
		this.commentLikeId = commentLikeId;
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
	 * @return  Integer likerId <br>
	 */
	public Integer getLikerId() {
		return likerId;
	}

	/**
	 * @param likerId <br>
	 */
	public void setLikerId(Integer likerId) {
		this.likerId = likerId;
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
