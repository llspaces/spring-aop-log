package com.lyp.aoplog.service;

import com.lyp.aoplog.entity.Log;

import java.util.List;

/**
 * LogService
 *
 * @author liyupeng
 * @since 2018-12-13 12:02
 */
public interface LogService {

    public void add(Log log);

    public List<Log> findAll();
}
