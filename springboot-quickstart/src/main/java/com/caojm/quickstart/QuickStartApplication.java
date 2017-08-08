package com.caojm.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 程序入口
 * 相关源码解读：http://www.jianshu.com/p/cb5cb5937686
 * @author :曹建明
 * @create 2017/08/07 15:53
 */
@SpringBootApplication
public class QuickStartApplication extends SpringBootServletInitializer{
    private final static Logger logger = LoggerFactory.getLogger(QuickStartApplication.class);

    public static void main(String[] args){
        logger.info("quick start application started >>>>>>>>>>");
        SpringApplication.run(QuickStartApplication.class);  //运行WEB
    }
}
