package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.UserrolesModel;
import com.imyueyue.admin.model.UserrolesQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: userroles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

public interface UserrolesDao extends IBaseDao<UserrolesModel, Integer> {
    
    List<UserrolesModel> query(int pn, int pageSize, UserrolesQueryModel command);

    int countQuery(UserrolesQueryModel command);

}  



