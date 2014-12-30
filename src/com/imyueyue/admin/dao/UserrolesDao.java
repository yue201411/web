package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.UserrolesModel;
import com.imyueyue.admin.model.UserrolesQueryModel;

/*
  @abstract(DB TableName: userroles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface UserrolesDao extends IBaseDao<UserrolesModel, Integer> {
    
    List<UserrolesModel> query(int pn, int pageSize, UserrolesQueryModel command);

    int countQuery(UserrolesQueryModel command);

}  



