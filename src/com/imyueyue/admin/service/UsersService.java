package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.UsersModel;
import com.imyueyue.admin.model.UsersQueryModel;

/*
  @abstract(DB TableName: users)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface UsersService extends IBaseService<UsersModel, Integer> {

    Page<UsersModel> query(int pn, int pageSize, UsersQueryModel command);
    boolean checkUser( UsersQueryModel command);
}



