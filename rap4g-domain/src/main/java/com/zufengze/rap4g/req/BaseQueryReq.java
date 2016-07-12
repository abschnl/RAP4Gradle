package com.zufengze.rap4g.req;

/**
 * 此类描述的是： 分页查询条件
 * 
 * @author: zufengze
 * @version: 2016年7月12日 上午9:48:22
 */
public class BaseQueryReq
{
	
	/** 起始记录数. */
	private Integer rowStart = 0;
	
	/** 当前页. */
	private Integer currentPage = 1;
	
	/** 每页记录数，默认为50， 为-1时代表查询所有. */
	private Integer pageSize = 50;
	
	/** 排序字段. */
	private String sort;
	
	/** 排序方式：(升序:asc,降序：desc)默认降序. */
	private String order = "desc";
	
	/**
	 * @return the rowStart
	 */
	public Integer getRowStart()
	{
		return rowStart;
	}
	
	/**
	 * @param rowStart the rowStart to set
	 */
	public void setRowStart(Integer rowStart)
	{
		this.rowStart = rowStart;
	}
	
	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage()
	{
		return currentPage;
	}
	
	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage)
	{
		this.currentPage = currentPage;
	}
	
	/**
	 * @return the pageSize
	 */
	public Integer getPageSize()
	{
		return pageSize;
	}
	
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize)
	{
		this.pageSize = pageSize;
	}
	
	/**
	 * @return the sort
	 */
	public String getSort()
	{
		return sort;
	}
	
	/**
	 * @param sort the sort to set
	 */
	public void setSort(String sort)
	{
		this.sort = sort;
	}
	
	/**
	 * @return the order
	 */
	public String getOrder()
	{
		return order;
	}
	
	/**
	 * @param order the order to set
	 */
	public void setOrder(String order)
	{
		this.order = order;
	}
	
	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("PagingQuestReq [rowStart=").append(rowStart).append(", currentPage=").append(currentPage)
			   .append(", pageSize=").append(pageSize).append(", sort=").append(sort).append(", order=").append(order)
			   .append(", toString()=").append(super.toString()).append("]");
		return builder.toString();
	}
	
}
