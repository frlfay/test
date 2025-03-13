package com.hspedu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: HelloController
 * Package: com.hspedu.springboot.controller
 * Description:
 *
 * @Author: FLFfang
 * @Create: 2023/10/11 - 09:06
 */
@Controller
public class HelloController {
    //返回hello,springboot
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello,springboot";
    }
}
