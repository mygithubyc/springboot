/**
 * 
 */
package com.example.demo.model;

/**
 * File： ArticleLikeRecorde.java<br>
 * Title: <br>
 * Description: 文章收藏记录<br>
 * Company: <br>
 * @author 
 * @version
 */
public class ArticleLikeRecorde {

	private Integer likeRecordeId;
	
	private Integer articleId;
	
	private Integer likerId;
	
	private String likeDate;
	
	private Integer isRead;

	/**
	 * @return  Integer likeRecordeId <br>
	 */
	public Integer getLikeRecordeId() {
		return likeRecordeId;
	}

	/**
	 * @param likeRecordeId <br>
	 */
	public void setLikeRecordeId(Integer likeRecordeId) {
		this.likeRecordeId = likeRecordeId;
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
