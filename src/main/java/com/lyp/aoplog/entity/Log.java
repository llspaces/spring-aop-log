package com.lyp.aoplog.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.*;
import java.util.Date;

/**
 * <p>@filename Log</p>
 * <p>
 * <p>@description TODO</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/13 11:41
 **/
@Data
@Entity
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String description;
    @Column
    private String method;
    @Column
    private String type;
    @Column
    private String requestIp;
    @Column
    private String exceptionCode;
    @Column
    private String exceptionDetail;
    @Column
    private String params;
    @Column
    private String createBy;
    @Column
    private Date createDate;
}
