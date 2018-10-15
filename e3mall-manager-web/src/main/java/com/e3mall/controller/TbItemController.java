package com.e3mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3mall.common.pojo.EasyUIDataGridResult;
import com.e3mall.common.pojo.EasyUITreeNode;
import com.e3mall.pojo.TbItem;
import com.e3mall.service.ItemCatService;
import com.e3mall.service.ItemService;

@Controller
@RequestMapping("/item")
public class TbItemController {

	@Autowired
	private ItemService itemService;
	@Autowired
	private ItemCatService itemCatService;
	
	@RequestMapping("getItemById/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		return itemService.getItemById(itemId);
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page,Integer rows) {
		//调用服务查询商品列表
		EasyUIDataGridResult itemList = itemService.getItemList(page, rows);
		return itemList;
	}
	@RequestMapping("/cat/list")
	@ResponseBody
	public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id", defaultValue="0")Integer parentId) {
		List<EasyUITreeNode> list = itemCatService.getItemCatList(parentId);
		return list;
	}
}
