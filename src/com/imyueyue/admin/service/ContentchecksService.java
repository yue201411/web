package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ContentchecksModel;
import com.imyueyue.admin.model.ContentchecksQueryModel;

/*
  @abstract(DB TableName: contentchecks)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentchecksService extends IBaseService<ContentchecksModel, Integer> {

    Page<ContentchecksModel> query(int pn, int pageSize, ContentchecksQueryModel command);
    
}



