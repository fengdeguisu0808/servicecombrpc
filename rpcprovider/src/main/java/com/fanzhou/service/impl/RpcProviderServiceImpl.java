package com.fanzhou.service.impl;

import com.fanzhou.service.RpcService;
import org.springframework.stereotype.Service;

/**
 * @author fanzhou
 * @create 2020/8/4 0004
 */
@Service
public class RpcProviderServiceImpl implements RpcService {

    @Override
    public String sayRpc(String name) {
        return "hello " + name;
    }
}
