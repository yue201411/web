package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ContentimgsModel;
import com.imyueyue.admin.model.ContentimgsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: contentimgs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentimgsService extends IBaseService<ContentimgsModel, Integer> {

    Page<ContentimgsModel> query(int pn, int pageSize, ContentimgsQueryModel command);
    
}



