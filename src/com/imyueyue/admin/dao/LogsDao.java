package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.LogsModel;
import com.imyueyue.admin.model.LogsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: logs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface LogsDao extends IBaseDao<LogsModel, Integer> {
    
    List<LogsModel> query(int pn, int pageSize, LogsQueryModel command);

    int countQuery(LogsQueryModel command);

}  



