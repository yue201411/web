package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.UserauthsModel;
import com.imyueyue.admin.model.UserauthsQueryModel;

/*
  @abstract(DB TableName: userauths)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface UserauthsService extends IBaseService<UserauthsModel, Integer> {

    Page<UserauthsModel> query(int pn, int pageSize, UserauthsQueryModel command);
    
}



