package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ContentattrsModel;
import com.imyueyue.admin.model.ContentattrsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: contentattrs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentattrsService extends IBaseService<ContentattrsModel, Integer> {

    Page<ContentattrsModel> query(int pn, int pageSize, ContentattrsQueryModel command);
    
}



