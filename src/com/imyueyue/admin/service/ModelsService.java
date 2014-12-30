package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ModelsModel;
import com.imyueyue.admin.model.ModelsQueryModel;

/*
  @abstract(DB TableName: models)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ModelsService extends IBaseService<ModelsModel, Integer> {

    Page<ModelsModel> query(int pn, int pageSize, ModelsQueryModel command);
    
}



