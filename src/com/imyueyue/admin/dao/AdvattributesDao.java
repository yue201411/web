package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.AdvattributesModel;
import com.imyueyue.admin.model.AdvattributesQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: advattributes)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface AdvattributesDao extends IBaseDao<AdvattributesModel, Integer> {
    
    List<AdvattributesModel> query(int pn, int pageSize, AdvattributesQueryModel command);

    int countQuery(AdvattributesQueryModel command);

}  



