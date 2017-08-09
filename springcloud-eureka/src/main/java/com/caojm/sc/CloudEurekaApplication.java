package com.caojm.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * <p>启动主类</p>
 * <p>参考：</p>
 * <p>http://www.jianshu.com/p/2ec09d0f947a ,http://www.jianshu.com/p/11c99dd04040 <p/>
 * <p>https://github.com/JeffLi1993/springcloud-learning-example</p>
 * @author :曹建明
 * @date :2017-02-24 16:05:27
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication.class);  //运行WEB
    }

}
