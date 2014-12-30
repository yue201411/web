package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ContentchecksModel;
import com.imyueyue.admin.model.ContentchecksQueryModel;

/*
  @abstract(DB TableName: contentchecks)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentchecksDao extends IBaseDao<ContentchecksModel, Integer> {
    
    List<ContentchecksModel> query(int pn, int pageSize, ContentchecksQueryModel command);

    int countQuery(ContentchecksQueryModel command);

}  



