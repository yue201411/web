package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ContentimgsModel;
import com.imyueyue.admin.model.ContentimgsQueryModel;

/*
  @abstract(DB TableName: contentimgs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentimgsService extends IBaseService<ContentimgsModel, Integer> {

    Page<ContentimgsModel> query(int pn, int pageSize, ContentimgsQueryModel command);
    
}



