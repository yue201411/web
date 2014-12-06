package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.AdsspacesModel;
import com.imyueyue.admin.model.AdsspacesQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: adsspaces)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:28)
  @cvs($Date: 2014/11/29 21:56:28 $)
*/ 

public interface AdsspacesDao extends IBaseDao<AdsspacesModel, Integer> {
    
    List<AdsspacesModel> query(int pn, int pageSize, AdsspacesQueryModel command);

    int countQuery(AdsspacesQueryModel command);

}  



