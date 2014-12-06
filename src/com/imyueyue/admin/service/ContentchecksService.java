package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ContentchecksModel;
import com.imyueyue.admin.model.ContentchecksQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: contentchecks)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentchecksService extends IBaseService<ContentchecksModel, Integer> {

    Page<ContentchecksModel> query(int pn, int pageSize, ContentchecksQueryModel command);
    
}



