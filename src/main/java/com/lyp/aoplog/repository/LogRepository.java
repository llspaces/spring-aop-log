package com.lyp.aoplog.repository;

import com.lyp.aoplog.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>@filename LogRepository</p>
 * <p>
 * <p>@description TODO</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/13 12:04
 **/
@Repository
public interface LogRepository extends JpaRepository<Log, Long> {
}
