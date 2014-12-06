package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ContentextsModel;
import com.imyueyue.admin.model.ContentextsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: contentexts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentextsService extends IBaseService<ContentextsModel, Integer> {

    Page<ContentextsModel> query(int pn, int pageSize, ContentextsQueryModel command);
    
}



