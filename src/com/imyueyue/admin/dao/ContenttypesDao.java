package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ContenttypesModel;
import com.imyueyue.admin.model.ContenttypesQueryModel;

/*
  @abstract(DB TableName: contenttypes)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContenttypesDao extends IBaseDao<ContenttypesModel, Integer> {
    
    List<ContenttypesModel> query(int pn, int pageSize, ContenttypesQueryModel command);

    int countQuery(ContenttypesQueryModel command);

}  



