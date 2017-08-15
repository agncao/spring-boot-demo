package com.caojm.demo.zuul.config;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.servlet.annotation.WebFilter;
import java.net.MalformedURLException;

/**
 * 设置允许跨域请求
 *
 * @date :2017-04-11 19:36:41
 */
@WebFilter(value = "/*",asyncSupported=true)
public class CorsFilter extends org.springframework.web.filter.CorsFilter {
    private Logger logger= LoggerFactory.getLogger(getClass());
    private static UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

    static {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
    }

    public CorsFilter(){
        super(source);
        logger.info("初始化CORS 过滤器完成。。。");
    }

    public static void main(String[] args) throws MalformedURLException {
        String u="http://localhost:8015/component/ajax4rest";

        System.out.println(StringUtils.countMatches(u,"/"));
        System.out.println(u.substring(0, StringUtils.ordinalIndexOf(u,"/",3)));

        String u1="http://localhost:8015";
        System.out.println(StringUtils.countMatches(u1,"/"));
        if(StringUtils.countMatches(u1, "/") > 2){
            System.out.println(u1.substring(0, StringUtils.ordinalIndexOf(u1,"/",3)));
        }else{
            System.out.println(u1);
        }

    }

}
