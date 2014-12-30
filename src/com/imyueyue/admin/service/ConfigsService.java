package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ConfigsModel;
import com.imyueyue.admin.model.ConfigsQueryModel;

/*
  @abstract(DB TableName: configs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface ConfigsService extends IBaseService<ConfigsModel, Integer> {

    Page<ConfigsModel> query(int pn, int pageSize, ConfigsQueryModel command);
    
}



