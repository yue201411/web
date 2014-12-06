package com.imyueyue.admin.service;

import com.imyueyue.admin.model.UserauthsModel;
import com.imyueyue.admin.model.UserauthsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: userauths)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

public interface UserauthsService extends IBaseService<UserauthsModel, Integer> {

    Page<UserauthsModel> query(int pn, int pageSize, UserauthsQueryModel command);
    
}



