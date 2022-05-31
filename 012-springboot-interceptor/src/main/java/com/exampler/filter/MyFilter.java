package com.exampler.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/4/27 18:17
 */
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("执行了过滤器");

        filterChain.doFilter(servletRequest,servletResponse);

    }
}
