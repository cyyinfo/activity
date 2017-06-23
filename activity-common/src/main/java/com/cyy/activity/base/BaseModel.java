package com.cyy.activity.base;

import java.util.Date;

public class BaseModel<T> extends BaseSearch<T>{

	private Long id;
	
	private Date createDate;
	
	private Date updateDate;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
