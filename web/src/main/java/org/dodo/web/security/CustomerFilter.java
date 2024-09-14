package org.dodo.web.security;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.LogRecord;

public class CustomerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("1111111111111");

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
