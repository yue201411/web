package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ContentattasModel;
import com.imyueyue.admin.model.ContentattasQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: contentattas)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentattasDao extends IBaseDao<ContentattasModel, Integer> {
    
    List<ContentattasModel> query(int pn, int pageSize, ContentattasQueryModel command);

    int countQuery(ContentattasQueryModel command);

}  



