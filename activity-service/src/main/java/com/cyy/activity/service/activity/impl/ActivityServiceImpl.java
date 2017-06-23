package com.cyy.activity.service.activity.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyy.activity.mapper.activity.ActivityMapper;
import com.cyy.activity.model.activity.Activity;
import com.cyy.activity.service.activity.ActivityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ActivityServiceImpl implements ActivityService{
	
	@Autowired
	private ActivityMapper activityMapper;

	@Override
	public Activity findById(Long id) {
		return activityMapper.findById(id);
	}

	@Override
	public PageInfo<Activity> find(Activity search) {
		if(search.getCurrPage() > 0 && search.getPageSize() > 0){
			PageHelper.startPage(search.getCurrPage(),search.getPageSize());
		}
		List<Activity> list =  activityMapper.find(search);
		PageInfo<Activity> page = new PageInfo<>(list);
		return page;
	}
	
	@Override
	public boolean add(Activity add){
		return activityMapper.add(add);
	}

}
