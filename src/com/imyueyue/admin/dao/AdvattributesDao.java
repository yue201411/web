package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.AdvattributesModel;
import com.imyueyue.admin.model.AdvattributesQueryModel;

/*
  @abstract(DB TableName: advattributes)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface AdvattributesDao extends IBaseDao<AdvattributesModel, Integer> {
    
    List<AdvattributesModel> query(int pn, int pageSize, AdvattributesQueryModel command);

    int countQuery(AdvattributesQueryModel command);

}  



