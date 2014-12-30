package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ContenttagsModel;
import com.imyueyue.admin.model.ContenttagsQueryModel;

/*
  @abstract(DB TableName: contenttags)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContenttagsService extends IBaseService<ContenttagsModel, Integer> {

    Page<ContenttagsModel> query(int pn, int pageSize, ContenttagsQueryModel command);
    
}



