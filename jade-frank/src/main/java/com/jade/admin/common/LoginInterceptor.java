package com.jade.admin.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (!SessionUtils.isLogin(request.getSession())) {
			response.sendRedirect(request.getContextPath() + "/passer/login.html");
			return false;
		}
		return true;
	}
	

}
