package com.caojm.demo.rest.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
 * @create 2017/08/03 16:29
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("")
    @ResponseBody
    public Map<String,Object> hello(){
        Map<String, Object> map = new HashMap<>();
        map.put("data","hello world");
        map.put("msg","");
        map.put("success",true);
        return map;
    }
}
