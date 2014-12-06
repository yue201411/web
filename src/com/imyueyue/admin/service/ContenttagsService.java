package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ContenttagsModel;
import com.imyueyue.admin.model.ContenttagsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: contenttags)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContenttagsService extends IBaseService<ContenttagsModel, Integer> {

    Page<ContenttagsModel> query(int pn, int pageSize, ContenttagsQueryModel command);
    
}



