package com.caojm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * 程序启动入口
 *
 * @author :<a href="mailto:yingjiezhang@ebnew.com">章英杰</a>
 * @date :2017-02-24 16:05:27
 */

/** 扫描 路径 scanBasePackages com.caojm 为当前业务基包 */
//@ImportResource({"classpath:application-dubbo.xml"})
@SpringBootApplication(scanBasePackages = {"com.caojm"})
public class Application extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(Application.class);  //运行WEB
    }

}
