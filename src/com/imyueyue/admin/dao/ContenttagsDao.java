package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ContenttagsModel;
import com.imyueyue.admin.model.ContenttagsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: contenttags)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContenttagsDao extends IBaseDao<ContenttagsModel, Integer> {
    
    List<ContenttagsModel> query(int pn, int pageSize, ContenttagsQueryModel command);

    int countQuery(ContenttagsQueryModel command);

}  



