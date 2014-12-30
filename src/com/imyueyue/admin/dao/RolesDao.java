package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.RolesModel;
import com.imyueyue.admin.model.RolesQueryModel;

/*
  @abstract(DB TableName: roles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface RolesDao extends IBaseDao<RolesModel, Integer> {
    
    List<RolesModel> query(int pn, int pageSize, RolesQueryModel command);

    int countQuery(RolesQueryModel command);

}  



