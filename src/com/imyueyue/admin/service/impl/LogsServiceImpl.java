package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;
import com.imyueyue.admin.dao.LogsDao;
import com.imyueyue.admin.model.LogsModel;
import com.imyueyue.admin.model.LogsQueryModel;
import com.imyueyue.admin.service.LogsService;

/*
  @abstract(DB TableName: logs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

@Service("LogsService")
public class LogsServiceImpl extends BaseService<LogsModel, Integer> implements LogsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogsServiceImpl.class);

    private LogsDao logsDao;

    @Autowired
    @Qualifier("LogsDao")
    @Override
    public void setBaseDao(IBaseDao<LogsModel, Integer> logsDao) {
        this.baseDao = logsDao;
        this.logsDao = (LogsDao) logsDao;
    }
    

    @Override
    public Page<LogsModel> query(int pn, int pageSize, LogsQueryModel command) {
        return PageUtil.getPage(logsDao.countQuery(command) ,pn, logsDao.query(pn, pageSize, command), pageSize);
    }
   
}



