//package com.e3mall.pagehelper;
//
//import java.util.List;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.e3mall.mapper.TbItemMapper;
//import com.e3mall.pojo.TbItem;
//import com.e3mall.pojo.TbItemExample;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//
//public class PageHelperTest {
//	
//	public static void main(String[] args) throws Exception{
//		//初始化spring容器
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
//		//从容器中获取Mapper代理对象
//		TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
//		//执行sql之前设置分页信息使用pagehelper的startpage方法
//		PageHelper.startPage(1, 10);
//		//执行查询
//		TbItemExample example = new TbItemExample();
//		List<TbItem> list = itemMapper.selectByExample(example);
//		//取分页信息，pageInfo 总记录数 总页数 当前页码
//		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
//		System.out.println(pageInfo.getTotal());
//		System.out.println(pageInfo.getPages());
//		System.out.println(list.size());
//	}
//
//}
