package com.zufengze.rap4g.rsp;

import java.util.List;

/**
 * 此类描述的是：分页查询共用返回结果.
 *
 * @param <T> the generic type
 * @author: zufengze
 * @version: 2016年7月25日 下午3:06:54
 */
public class PageQuestRsp<T> {

    /** 总数. */
    private int     totalCount;

    /** 总页数. */
    private int     totalPage;

    /** The data. */
    private List<T> list;

    /**
     * The Constructor.
     *
     * @param totalCount 总记录数
     * @param data 数据列表
     * @param pageSize 每页记录数
     */
    public PageQuestRsp(int totalCount, List<T> list, int pageSize) {
        super();
        this.list = list;
        this.totalCount = totalCount;
        this.totalPage = setToalPage(pageSize);
    }

    /**
     * @param totalPage the totalPage to set
     */
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * 设置总页数.
     *
     * @param pageSize 每页记录数
     * @return the int
     */
    private int setToalPage(int pageSize) {
        if (totalCount < 1) {
            return 0;
        }

        return (totalCount % pageSize == 0) ? totalCount / pageSize : totalCount / pageSize + 1;
    }

    /**
     * Gets the total page.
     *
     * @return the total page
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * Gets the data.
     *
     * @return the data
     */
    public List<T> getList() {
        return list;
    }

    /**
     * Sets the data.
     *
     * @param data the data
     */
    public void setList(List<T> list) {
        this.list = list;
    }

    /**
     * totalCount.
     *
     * @return the totalCount
     * @since JDK 1.6
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * totalCount.
     *
     * @param totalCount the totalCount to set
     * @since JDK 1.6
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PageQuestRsp [totalCount=");
        builder.append(totalCount);
        builder.append(", totalPage=");
        builder.append(totalPage);
        builder.append(", list=");
        builder.append(list);
        builder.append("]");
        return builder.toString();
    }

}
