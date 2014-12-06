package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.UsersModel;
import com.imyueyue.admin.model.UsersQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: users)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

public interface UsersDao extends IBaseDao<UsersModel, Integer> {
    
    List<UsersModel> query(int pn, int pageSize, UsersQueryModel command);

    int countQuery(UsersQueryModel command);

}  



