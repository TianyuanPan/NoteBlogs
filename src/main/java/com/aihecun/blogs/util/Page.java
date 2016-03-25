package com.aihecun.blogs.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 数据分页列表信息
 * @param <T> 数据实体类
 * @author yp
 * @date 2016-01-15 10:46:18 中国标准时间
 */
public abstract class Page<T>{
	
	private int currentPage = 0; 
	private int pageSize = 0;
	private int totalPage = 0;
	private int totalRecord = 0; 
	
	private List<T> data = new ArrayList<T>();
	
	public Page() {
	}
	
	public Page(int currentPage, int pageSize, int totalPage, int totalRecord,
				List<T> data) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
		this.totalRecord = totalRecord;
		this.data = data;
	}

	public Page(List<T> all) {
		super();
		this.currentPage = 0;
		this.pageSize = all.size();
		this.totalPage = 1;
		this.totalRecord = all.size();
		this.data = all;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
	
}
