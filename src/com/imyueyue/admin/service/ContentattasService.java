package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ContentattasModel;
import com.imyueyue.admin.model.ContentattasQueryModel;

/*
  @abstract(DB TableName: contentattas)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentattasService extends IBaseService<ContentattasModel, Integer> {

    Page<ContentattasModel> query(int pn, int pageSize, ContentattasQueryModel command);
    
}



