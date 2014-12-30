package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.SitesModel;
import com.imyueyue.admin.model.SitesQueryModel;

/*
  @abstract(DB TableName: sites)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface SitesDao extends IBaseDao<SitesModel, Integer> {
    
    List<SitesModel> query(int pn, int pageSize, SitesQueryModel command);

    int countQuery(SitesQueryModel command);

}  



