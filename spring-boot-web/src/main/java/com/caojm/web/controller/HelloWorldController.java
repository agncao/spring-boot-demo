package com.caojm.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
 * @create 2017/08/03 16:29
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("")
    public ModelAndView hello(ModelAndView mv,HttpSession session){
        logger.info("begin execute method:{}","hello");

        mv.addObject("hello", "hello world");
        mv.setViewName("index");
        return mv;
    }
}
