package com.open.controller;


import com.open.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: IndexController
 * @author： Tang
 * @createTime 2017年11月3日 下午4:59:06
 **/
@Controller
public class IndexController {
	
	@Autowired
	IndexService indexService;
	
	@RequestMapping("/test")
	public String getCount(){
		int count = indexService.queryCount();
		System.out.println(count);
		
		return "test/test";
	}

}
