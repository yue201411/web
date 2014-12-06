package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ContentattasModel;
import com.imyueyue.admin.model.ContentattasQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: contentattas)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentattasService extends IBaseService<ContentattasModel, Integer> {

    Page<ContentattasModel> query(int pn, int pageSize, ContentattasQueryModel command);
    
}



