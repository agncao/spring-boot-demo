package com.caojm.demo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 程序启动入口
 * 参考文档：http://blog.csdn.net/liuchuanhong1/article/details/59064794
 * @author :曹建明
 * @date :2017-02-24 16:05:27
 */

/** 扫描 路径 scanBasePackages com.caojm 为当前业务基包 */
@EnableSwagger2
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.caojm.demo.rest","com.caojm.framework"})
public class RestfulApiApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(RestfulApiApplication.class);  //运行WEB
    }

}
