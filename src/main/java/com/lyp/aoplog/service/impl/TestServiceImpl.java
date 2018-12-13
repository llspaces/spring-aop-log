package com.lyp.aoplog.service.impl;

import com.lyp.aoplog.annotation.ServiceLog;
import com.lyp.aoplog.entity.Log;
import com.lyp.aoplog.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Override
    @ServiceLog(description = "TestServiceImpl.test()")
    public String test(String user) {
        return "test service : " + user;
    }


}
