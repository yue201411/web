package com.imyueyue.admin.service;

import com.imyueyue.admin.model.UsersModel;
import com.imyueyue.admin.model.UsersQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: users)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

public interface UsersService extends IBaseService<UsersModel, Integer> {

    Page<UsersModel> query(int pn, int pageSize, UsersQueryModel command);
    
}



