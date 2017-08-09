package com.caojm.demo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * 程序启动入口
 * 相关源码解读：http://www.jianshu.com/p/cb5cb5937686
 * @author :曹建明
 * @date :2017-02-24 16:05:27
 */

/** 扫描 路径 scanBasePackages com.caojm 为当前业务基包 */
@SpringBootApplication
public class RestfulApiApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(RestfulApiApplication.class);  //运行WEB
    }

}
