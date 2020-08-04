package com.fanzhou.service.impl;

import com.fanzhou.service.RpcService;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.springframework.stereotype.Service;

/**
 * @author fanzhou
 * @create 2020/8/4 0004
 */
@Service
public class RpcConsumerServiceImpl implements RpcService {

    @RpcReference(microserviceName = "start.servicecomb.io:rpc-provider",schemaId = "providerSchema")
    private RpcService rpcService;

    @Override
    public String sayRpc(String name) {
        return rpcService.sayRpc(name);
    }
}
