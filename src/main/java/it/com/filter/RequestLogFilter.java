package it.com.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/**
 * @Title:
 * @Description:
 * @date 2022/7/1314:57
 */
public class RequestLogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("请求日志开始:" + new Date());
        chain.doFilter(request, response);
        System.out.println("请求日志结束:" + new Date());
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
