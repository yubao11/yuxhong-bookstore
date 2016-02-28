// This file is part of saikiranBookstoreApp-master.
// Copyright (C) 2015-2016 The Operate-Monitor Authors.
//
package util;

import javax.servlet.*;
import java.io.IOException;

public class SetCharacterEncoding implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
