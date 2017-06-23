package com.cyy.activity.base;

/**
 * 方便查询
 * @author Administrator
 * @param <T>
 */
public class BaseSearch<T> {
	
	private int currPage;
	
	private int pageSize;

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
