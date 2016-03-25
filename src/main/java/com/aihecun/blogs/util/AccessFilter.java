package com.aihecun.blogs.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by TianyuanPan on 3/21/16.
 */
public class AccessFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest srequest, ServletResponse sresponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) srequest;
        HttpServletResponse response = (HttpServletResponse) sresponse;
        String url = request.getRequestURI();

        //System.out.println();
        System.out.println("filter url ---"+url);

        // 判断是否存在login.jsp
        String reg1 = ".*login.*";
        String reg2 = ".*.jsp.*";
        String reg3 = ".*\\..*";
        String resource = ".*app.*|.*css.*|.*custom.*|.*images.*|.*js.*|.*vendor.*";
        String login = ".*login.*|.*userlogin.*";
        String reg4 = ".*views.*|.*user.*|.*device.*";

//		if(!url.matches(resource)){
//			if(!url.matches(login)){
//				if(SessionUtil.getUser(request) == null){
//					response.sendRedirect(request.getContextPath() + "/login");
//					return;
//				}
//			}
//		}
//		if(!url.matches(reg1)){
//			if (url.matches(reg4)){
//				if(SessionUtil.getUser(request) == null){
//					response.sendRedirect(request.getContextPath() + "/login");
//					return;
//				}
//			}
//		}

        filterChain.doFilter(request, response);
    }

}
