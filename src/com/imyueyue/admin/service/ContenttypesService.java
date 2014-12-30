package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ContenttypesModel;
import com.imyueyue.admin.model.ContenttypesQueryModel;

/*
  @abstract(DB TableName: contenttypes)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContenttypesService extends IBaseService<ContenttypesModel, Integer> {

    Page<ContenttypesModel> query(int pn, int pageSize, ContenttypesQueryModel command);
    
}



