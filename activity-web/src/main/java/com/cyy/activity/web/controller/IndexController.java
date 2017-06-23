package com.cyy.activity.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cyy.activity.model.activity.Activity;
import com.cyy.activity.service.activity.ActivityService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private ActivityService activityService;

	@RequestMapping("/")
	public @ResponseBody String index(){
		return "web service is ok.";
	}
	
	@RequestMapping("add")
	public @ResponseBody String add(@RequestParam(value="name")String name){
		Activity ac = new Activity();
		ac.setBannerUrl("bannerUrl");
		ac.setContentUrl("contenUrl");
		ac.setCreateDate(new Date());
		ac.setUpdateDate(new Date());
		ac.setDescription("description");
		ac.setName(name);
		boolean res = activityService.add(ac);
		return res ? "ok" : "fail";
	}
	
	
	@RequestMapping("test")
	public @ResponseBody String test(){
		Activity activity = activityService.findById(2l);
		String json = activity == null ?"null" : JSON.toJSONString(activity);
		return json;
	}
	
	@RequestMapping("list")
	public @ResponseBody String list(@RequestParam(value="page",required=false,defaultValue="0") int page){
		Activity search = new Activity();
		search.setCurrPage(page <= 0 ? 1 : page);
		search.setPageSize(10);
		search.setId(0l);
		PageInfo<Activity> pageinfo = activityService.find(search);
		String json = JSON.toJSONString(pageinfo.getList());
		return json;
	}
	
}
