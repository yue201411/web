package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ConfigsModel;
import com.imyueyue.admin.model.ConfigsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: configs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ConfigsService extends IBaseService<ConfigsModel, Integer> {

    Page<ConfigsModel> query(int pn, int pageSize, ConfigsQueryModel command);
    
}



