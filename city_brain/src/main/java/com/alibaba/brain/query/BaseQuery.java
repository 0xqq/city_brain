package com.alibaba.brain.query;

/**
 * 基本的查询信息
 */
public class BaseQuery {

    /**
     * 第几页
     */
    private int pageNum;

    /**
     * 每页的行数
     */
    private int pageSize;



    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
