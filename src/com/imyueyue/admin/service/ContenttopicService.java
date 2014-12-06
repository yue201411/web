package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ContenttopicModel;
import com.imyueyue.admin.model.ContenttopicQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: contenttopic)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContenttopicService extends IBaseService<ContenttopicModel, Integer> {

    Page<ContenttopicModel> query(int pn, int pageSize, ContenttopicQueryModel command);
    
}



