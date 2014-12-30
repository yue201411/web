package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ContentextsModel;
import com.imyueyue.admin.model.ContentextsQueryModel;

/*
  @abstract(DB TableName: contentexts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentextsService extends IBaseService<ContentextsModel, Integer> {

    Page<ContentextsModel> query(int pn, int pageSize, ContentextsQueryModel command);
    
}



