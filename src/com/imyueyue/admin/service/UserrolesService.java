package com.imyueyue.admin.service;

import com.imyueyue.admin.model.UserrolesModel;
import com.imyueyue.admin.model.UserrolesQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: userroles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

public interface UserrolesService extends IBaseService<UserrolesModel, Integer> {

    Page<UserrolesModel> query(int pn, int pageSize, UserrolesQueryModel command);
    
}



