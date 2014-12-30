package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ContenttopicModel;
import com.imyueyue.admin.model.ContenttopicQueryModel;

/*
  @abstract(DB TableName: contenttopic)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContenttopicDao extends IBaseDao<ContenttopicModel, Integer> {
    
    List<ContenttopicModel> query(int pn, int pageSize, ContenttopicQueryModel command);

    int countQuery(ContenttopicQueryModel command);

}  



