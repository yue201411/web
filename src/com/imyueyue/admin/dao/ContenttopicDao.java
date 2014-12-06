package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ContenttopicModel;
import com.imyueyue.admin.model.ContenttopicQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: contenttopic)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContenttopicDao extends IBaseDao<ContenttopicModel, Integer> {
    
    List<ContenttopicModel> query(int pn, int pageSize, ContenttopicQueryModel command);

    int countQuery(ContenttopicQueryModel command);

}  



