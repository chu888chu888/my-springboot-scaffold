package com.chu.controller.webview;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by P70 on 2016/12/5.
 */

@RestController
@EnableAutoConfiguration
public class IndexController {

    @ApiOperation(value="默认访问页", notes="默认访问页")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "hello world!";
    }
}
