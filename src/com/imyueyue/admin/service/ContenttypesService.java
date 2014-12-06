﻿package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ContenttypesModel;
import com.imyueyue.admin.model.ContenttypesQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: contenttypes)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContenttypesService extends IBaseService<ContenttypesModel, Integer> {

    Page<ContenttypesModel> query(int pn, int pageSize, ContenttypesQueryModel command);
    
}



