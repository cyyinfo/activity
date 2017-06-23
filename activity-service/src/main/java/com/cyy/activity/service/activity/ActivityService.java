package com.cyy.activity.service.activity;

import com.cyy.activity.model.activity.Activity;
import com.github.pagehelper.PageInfo;

public interface ActivityService {

	Activity findById(Long id);
	
	boolean add(Activity add);
	
	PageInfo<Activity> find(Activity search);
}
