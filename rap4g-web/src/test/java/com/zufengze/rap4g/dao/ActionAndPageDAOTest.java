package com.zufengze.rap4g.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zufengze.rap4g.dataobject.ActionAndPageDO;

/**
 *	配置spring与junit整合，junit启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ActionAndPageDAOTest {

	//注入DAO实现类
	@Resource
	private ActionAndPageDAO actionAndPageDAO;
	@Test
	public void testInsertActionAndPage() {
		ActionAndPageDO actionAndPageDO = new ActionAndPageDO();
		actionAndPageDO.setActionId(1L);
		actionAndPageDO.setPageId(1L);
		actionAndPageDAO.insertActionAndPage(actionAndPageDO);
	}

}
