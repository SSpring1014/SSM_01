package com.ow.ssm.controller;


import com.ow.ssm.po.ItemsCustom;
import com.ow.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 
 * <p>
 * Title: ItemsController
 * </p>
 * <p>
 * Description:商品的controller
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 为了对url进行分类管理 ，可以在这里定义根路径，最终访问url是根路径+子路径
 * 比如：商品列表：/items/queryItems.action
 * @author 传智.燕青
 * @date 2015-4-13下午4:03:35
 * @version 1.0
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	/**
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryItems")
	public ModelAndView queryItems(HttpServletRequest request) throws Exception {
		//测试forward后request是否可以共享
		
		System.out.println(request.getParameter("id"));

		// 调用service查找 数据库，查询商品列表
		List<ItemsCustom> itemsList = itemsService.findItemsList(null);
		
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribute，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);

		// 指定视图
		// 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		// 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		modelAndView.setViewName("items/itemsList");

		return modelAndView;

	}



}
