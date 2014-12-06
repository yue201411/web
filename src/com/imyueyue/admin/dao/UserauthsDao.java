package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.UserauthsModel;
import com.imyueyue.admin.model.UserauthsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: userauths)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

public interface UserauthsDao extends IBaseDao<UserauthsModel, Integer> {
    
    List<UserauthsModel> query(int pn, int pageSize, UserauthsQueryModel command);

    int countQuery(UserauthsQueryModel command);

}  



