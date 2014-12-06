package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ModelsModel;
import com.imyueyue.admin.model.ModelsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: models)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ModelsService extends IBaseService<ModelsModel, Integer> {

    Page<ModelsModel> query(int pn, int pageSize, ModelsQueryModel command);
    
}



