package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.AdsspacesModel;
import com.imyueyue.admin.model.AdsspacesQueryModel;

/*
  @abstract(DB TableName: adsspaces)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:18)
  @cvs($Date: 2014/12/7 21:29:18 $)
*/ 

public interface AdsspacesDao extends IBaseDao<AdsspacesModel, Integer> {
    
    List<AdsspacesModel> query(int pn, int pageSize, AdsspacesQueryModel command);

    int countQuery(AdsspacesQueryModel command);

}  



