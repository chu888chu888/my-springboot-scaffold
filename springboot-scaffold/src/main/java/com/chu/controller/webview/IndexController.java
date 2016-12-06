package com.chu.controller.webview;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by P70 on 2016/12/5.
 */

@Controller
@EnableAutoConfiguration
public class IndexController {

    @ApiOperation(value="默认访问页", notes="默认访问页")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("title", "登录Demo");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
