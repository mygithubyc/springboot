/**
 * 
 */
package com.example.demo.model;

/**
 * File： ArticleCategories.java<br>
 * Title: <br>
 * Description: 文章分类<br>
 * Company: <br>
 * @author 
 * @version
 */
public class ArticleCategories {

	private Integer categoryId;
	
	private String categoryName;

	/**
	 * @return  Integer categoryId <br>
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId <br>
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return  String categoryName <br>
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName <br>
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
