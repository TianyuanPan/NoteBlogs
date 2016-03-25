package com.aihecun.blogs.util;

/**
 * Service层公用的Exception.
 * @author yp
 * @date 2016-01-15 10:46:18 中国标准时间
 */
public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = 3583566093089790852L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}