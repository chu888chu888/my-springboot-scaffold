package com.chu.util.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by P70 on 2016/11/30.
 */
@WebServlet(urlPatterns = { "/druid/*" },
            initParams = { @WebInitParam(name = "loginUsername", value = "chu888"),
                           @WebInitParam(name = "loginPassword", value = "chu888") })
public class DruidStatViewServlet extends StatViewServlet {

    private static final long serialVersionUID = 1L;

}
