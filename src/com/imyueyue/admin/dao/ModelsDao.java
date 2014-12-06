package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ModelsModel;
import com.imyueyue.admin.model.ModelsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: models)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ModelsDao extends IBaseDao<ModelsModel, Integer> {
    
    List<ModelsModel> query(int pn, int pageSize, ModelsQueryModel command);

    int countQuery(ModelsQueryModel command);

}  



