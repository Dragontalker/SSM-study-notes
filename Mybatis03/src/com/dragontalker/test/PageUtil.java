package com.dragontalker.test;

import com.dragontalker.bean.Emp;
import com.github.pagehelper.PageInfo;

/**
 * 首页 上一页 1 2 3 4 5 下一页 末页
 */
public class PageUtil {

	public void getPageInfo(PageInfo<Emp> pageInfo) {
		
		StringBuilder builder = new StringBuilder();
		
		// 拼接首页
		builder.append("<a href='emps>首页</a>");
	}
}
