package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ConfigsModel;
import com.imyueyue.admin.model.ConfigsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: configs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ConfigsDao extends IBaseDao<ConfigsModel, Integer> {
    
    List<ConfigsModel> query(int pn, int pageSize, ConfigsQueryModel command);

    int countQuery(ConfigsQueryModel command);

}  



