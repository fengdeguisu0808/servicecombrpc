package com.fanzhou.controller;

import com.fanzhou.service.RpcService;
import org.apache.servicecomb.provider.pojo.RpcSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanzhou
 * @create 2020/8/4 0004
 */
//注意不能加@RpcSchema
@RestController
@RequestMapping(path = "/consumerRoot")
public class RpcConsumerController {

    @Autowired
    private RpcService rpcService;

    @GetMapping(path = "/helloWorld")
    public String sayRpc(){
        return rpcService.sayRpc("xiao fanzhou");
    }
}
