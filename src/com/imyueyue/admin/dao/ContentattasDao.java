package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ContentattasModel;
import com.imyueyue.admin.model.ContentattasQueryModel;

/*
  @abstract(DB TableName: contentattas)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentattasDao extends IBaseDao<ContentattasModel, Integer> {
    
    List<ContentattasModel> query(int pn, int pageSize, ContentattasQueryModel command);

    int countQuery(ContentattasQueryModel command);

}  



