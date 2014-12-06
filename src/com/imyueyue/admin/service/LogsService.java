package com.imyueyue.admin.service;

import com.imyueyue.admin.model.LogsModel;
import com.imyueyue.admin.model.LogsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: logs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface LogsService extends IBaseService<LogsModel, Integer> {

    Page<LogsModel> query(int pn, int pageSize, LogsQueryModel command);
    
}



