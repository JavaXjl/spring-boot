package com.xjl.crm.page;

import java.io.Serializable;

/**
 * 
 * @描述: 分页参数传递工具类 .
 * @作者: huanglian .
 */
public class Pager implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 6297178964005032338L;
	private int pageNum; // 当前页数
	private int pageSize; // 每页记录数

	public Pager() {}

	public Pager(int pageNum, int pageSize) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	/** 当前页数 */
	public int getPageNum() {
		return pageNum;
	}

	/** 当前页数 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	/** 每页记录数 */
	public int getPageSize() {
		return pageSize;
	}

	/** 每页记录数 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
