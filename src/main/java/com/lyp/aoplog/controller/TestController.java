package com.lyp.aoplog.controller;

import com.lyp.aoplog.annotation.ControllerLog;
import com.lyp.aoplog.annotation.ServiceLog;
import com.lyp.aoplog.entity.Log;
import com.lyp.aoplog.service.LogService;
import com.lyp.aoplog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>@filename TestController</p>
 * <p>
 * <p>@description TODO</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/13 11:55
 **/
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private LogService logService;

    @GetMapping("/test")
    @ControllerLog(description = "TestController.test()")
    public String test(String user){
        return "test controller : " + user;
    }

    @GetMapping("/testService")
    @ControllerLog(description = "TestController.testService()")
    public String testService(String user){
        return testService.test(user);
    }

    @ControllerLog(description = "TestController.findAllLog()")
    @GetMapping("/findAllLog")
    public List<Log> findAllLog(){
        return logService.findAll();
    }
}
