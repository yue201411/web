package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ContentchecksModel;
import com.imyueyue.admin.model.ContentchecksQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: contentchecks)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentchecksDao extends IBaseDao<ContentchecksModel, Integer> {
    
    List<ContentchecksModel> query(int pn, int pageSize, ContentchecksQueryModel command);

    int countQuery(ContentchecksQueryModel command);

}  



