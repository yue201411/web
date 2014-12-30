package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ContenttagsModel;
import com.imyueyue.admin.model.ContenttagsQueryModel;

/*
  @abstract(DB TableName: contenttags)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContenttagsDao extends IBaseDao<ContenttagsModel, Integer> {
    
    List<ContenttagsModel> query(int pn, int pageSize, ContenttagsQueryModel command);

    int countQuery(ContenttagsQueryModel command);

}  



