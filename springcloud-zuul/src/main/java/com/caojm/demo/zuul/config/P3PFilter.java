package com.caojm.demo.zuul.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 兼容IE下AJAX 跨域重定向问题.
 *
 * @date :2017-04-11 14:49:21
 */
@WebFilter("/*")
public class P3PFilter implements Filter {
    private Logger logger= LoggerFactory.getLogger(P3PFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("初始化P3P 过滤器完成。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ((HttpServletResponse)servletResponse).setHeader("P3P","CP=CURa ADMa DEVa PSAo PSDo OUR BUS UNI PUR INT DEM STA PRE COM NAV OTC NOI DSP COR");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
