package com.cyy.activity.mapper.activity;


import java.util.List;

import com.cyy.activity.model.activity.Activity;

public interface ActivityMapper {
	
	public Activity findById(Long id);
	
	public List<Activity> find(Activity search);
	
	boolean add(Activity add);

}
