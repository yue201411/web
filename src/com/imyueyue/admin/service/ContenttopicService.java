package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ContenttopicModel;
import com.imyueyue.admin.model.ContenttopicQueryModel;

/*
  @abstract(DB TableName: contenttopic)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContenttopicService extends IBaseService<ContenttopicModel, Integer> {

    Page<ContenttopicModel> query(int pn, int pageSize, ContenttopicQueryModel command);
    
}



