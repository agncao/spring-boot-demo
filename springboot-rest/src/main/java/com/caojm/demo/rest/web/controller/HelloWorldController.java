package com.caojm.demo.rest.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
 * @create 2017/08/03 16:29
 */
@RestController
@RequestMapping("/hello")
@Api(value = "hello world",description = "hello word restfull api demo")
public class HelloWorldController {
    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("")
//    @ApiOperation(value = "hello",httpMethod = "GET",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "hello",httpMethod = "GET",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String,Object> hello(){
        logger.info("开始请求{}.....","/hello");
        Map<String, Object> map = new HashMap<>();
        map.put("data","hello world");
        map.put("msg","");
        map.put("success",true);
        return map;
    }
}
