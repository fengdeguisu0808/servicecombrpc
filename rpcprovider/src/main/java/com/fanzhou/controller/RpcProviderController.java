package com.fanzhou.controller;

import com.fanzhou.service.RpcService;
import org.apache.servicecomb.provider.pojo.RpcSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanzhou
 * @create 2020/8/4 0004
 */
//注意不能加@RestController
@RpcSchema(schemaId = "providerSchema")
@RequestMapping(path = "/providerRoot")
public class RpcProviderController {

    @Autowired
    private RpcService rpcService;

    @GetMapping(path = "/hello")
    public String sayRpc(String name){
        System.out.println("服务提供者9092-9082");
        return rpcService.sayRpc(name);
    }
}
