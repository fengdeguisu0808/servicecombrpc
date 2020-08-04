package com.fanzhou;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fanzhou
 * @create 2020/8/4 0004
 */
@SpringBootApplication
@EnableServiceComb
public class RpcProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcProviderApplication.class,args);
    }
}
