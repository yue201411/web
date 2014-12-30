package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.LogsModel;
import com.imyueyue.admin.model.LogsQueryModel;

/*
  @abstract(DB TableName: logs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface LogsService extends IBaseService<LogsModel, Integer> {

    Page<LogsModel> query(int pn, int pageSize, LogsQueryModel command);
    
}



