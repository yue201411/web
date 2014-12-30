package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ModelsModel;
import com.imyueyue.admin.model.ModelsQueryModel;

/*
  @abstract(DB TableName: models)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ModelsDao extends IBaseDao<ModelsModel, Integer> {
    
    List<ModelsModel> query(int pn, int pageSize, ModelsQueryModel command);

    int countQuery(ModelsQueryModel command);

}  



