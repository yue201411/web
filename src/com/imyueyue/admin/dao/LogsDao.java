package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.LogsModel;
import com.imyueyue.admin.model.LogsQueryModel;

/*
  @abstract(DB TableName: logs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface LogsDao extends IBaseDao<LogsModel, Integer> {
    
    List<LogsModel> query(int pn, int pageSize, LogsQueryModel command);

    int countQuery(LogsQueryModel command);

}  



