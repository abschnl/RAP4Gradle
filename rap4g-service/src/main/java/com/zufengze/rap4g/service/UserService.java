/**
 * 文件名： UserService.java 此类描述的是： 作者: zufengze 创建时间: 2016年7月11日 上午11:28:55
 */
package com.zufengze.rap4g.service;

/**
 * 用户相关
 * 
 * @author: zufengze
 * @version:
 */
public interface UserService
{
	
	/**
	 * 登录.
	 *
	 * @param account 账户
	 * @param passwd 密码
	 * @throws Exception 失败抛出异常
	 */
	public Long login(String account, String passwd) throws Exception;
}
