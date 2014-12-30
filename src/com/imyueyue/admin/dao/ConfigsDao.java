package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ConfigsModel;
import com.imyueyue.admin.model.ConfigsQueryModel;

/*
  @abstract(DB TableName: configs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface ConfigsDao extends IBaseDao<ConfigsModel, Integer> {
    
    List<ConfigsModel> query(int pn, int pageSize, ConfigsQueryModel command);

    int countQuery(ConfigsQueryModel command);

}  



