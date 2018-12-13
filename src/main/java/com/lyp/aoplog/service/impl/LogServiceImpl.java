package com.lyp.aoplog.service.impl;

import com.lyp.aoplog.annotation.ServiceLog;
import com.lyp.aoplog.entity.Log;
import com.lyp.aoplog.repository.LogRepository;
import com.lyp.aoplog.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService{
    @Autowired
    private LogRepository logRepository;

    @Override
    public void add(Log log) {
        logRepository.save(log);
    }

    @Override
    @ServiceLog(description = "LogServiceImpl.findAll()")
    public List<Log> findAll(){
        return logRepository.findAll();
    }
}
