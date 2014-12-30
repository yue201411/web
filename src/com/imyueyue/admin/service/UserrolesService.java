package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.UserrolesModel;
import com.imyueyue.admin.model.UserrolesQueryModel;

/*
  @abstract(DB TableName: userroles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface UserrolesService extends IBaseService<UserrolesModel, Integer> {

    Page<UserrolesModel> query(int pn, int pageSize, UserrolesQueryModel command);
    
}



