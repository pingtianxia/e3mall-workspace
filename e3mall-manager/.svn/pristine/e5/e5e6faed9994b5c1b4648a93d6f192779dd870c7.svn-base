package com.e3mall.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3mall.common.pojo.EasyUIDataGridResult;
import com.e3mall.mapper.TbItemMapper;
import com.e3mall.pojo.TbItem;
import com.e3mall.pojo.TbItemExample;
import com.e3mall.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 商品管理Service
 * @author HYP
 * @date 2018年8月14日
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public TbItem getItemById(Long itemId) {
		return tbItemMapper.selectByPrimaryKey(itemId);
	}

	@Override
	public EasyUIDataGridResult getItemList(int page, int rows) {
		//设置分页
		PageHelper.startPage(page, rows);
		//执行查询
		TbItemExample example = new TbItemExample();
		example.setPage(page);
		example.setRows(rows);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		Long count = tbItemMapper.selectByExampleCount(example);
		//创建一个返回值对象
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult();
		easyUIDataGridResult.setRows(list);
		//获取分页结果
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		//获取总记录数
		easyUIDataGridResult.setTotal(count);
		return easyUIDataGridResult;
		
	}

}
