package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ContentattrsModel;
import com.imyueyue.admin.model.ContentattrsQueryModel;

/*
  @abstract(DB TableName: contentattrs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentattrsService extends IBaseService<ContentattrsModel, Integer> {

    Page<ContentattrsModel> query(int pn, int pageSize, ContentattrsQueryModel command);
    
}



