package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ContenttypesModel;
import com.imyueyue.admin.model.ContenttypesQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: contenttypes)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContenttypesDao extends IBaseDao<ContenttypesModel, Integer> {
    
    List<ContenttypesModel> query(int pn, int pageSize, ContenttypesQueryModel command);

    int countQuery(ContenttypesQueryModel command);

}  



