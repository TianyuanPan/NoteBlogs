package com.aihecun.blogs.util;

import com.aihecun.blogs.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 获取Session工具类
 * @author yp
 * @date 2016-01-15 10:46:18 中国标准时间
 */
public class SessionUtil {

	/**
	 * 获取当前登陆用户
	 * @param request
	 * @return
	 */
	public static User getUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object user = session.getAttribute("user");
		if (user instanceof User) {
			return User.class.cast(user);
		}
		return null;
	}

	/**
	 * 存入登陆用户
	 * @param request
	 * @param user
	 */
	public static void setUser(HttpServletRequest request, User user) {
		request.getSession().setAttribute("user", user);
	}

	/**
	 * 移除登陆用户
	 * @param request
	 */
	public static void removeUser(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
	}
}
