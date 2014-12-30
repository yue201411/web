package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.demo.model.UserQueryModel;
import com.imyueyue.admin.model.UsersModel;
import com.imyueyue.admin.model.UsersQueryModel;

/*
  @abstract(DB TableName: users)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface UsersDao extends IBaseDao<UsersModel, Integer> {
    
    List<UsersModel> query(int pn, int pageSize, UsersQueryModel command);

    int countQuery(UsersQueryModel command);
    
    boolean checkUser(UsersQueryModel command);

}  



