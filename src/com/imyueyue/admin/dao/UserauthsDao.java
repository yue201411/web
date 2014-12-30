package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.UserauthsModel;
import com.imyueyue.admin.model.UserauthsQueryModel;

/*
  @abstract(DB TableName: userauths)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface UserauthsDao extends IBaseDao<UserauthsModel, Integer> {
    
    List<UserauthsModel> query(int pn, int pageSize, UserauthsQueryModel command);

    int countQuery(UserauthsQueryModel command);

}  



