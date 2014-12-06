package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.RolesModel;
import com.imyueyue.admin.model.RolesQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: roles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

public interface RolesDao extends IBaseDao<RolesModel, Integer> {
    
    List<RolesModel> query(int pn, int pageSize, RolesQueryModel command);

    int countQuery(RolesQueryModel command);

}  



