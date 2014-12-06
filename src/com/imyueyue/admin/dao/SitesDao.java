package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.SitesModel;
import com.imyueyue.admin.model.SitesQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: sites)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

public interface SitesDao extends IBaseDao<SitesModel, Integer> {
    
    List<SitesModel> query(int pn, int pageSize, SitesQueryModel command);

    int countQuery(SitesQueryModel command);

}  



