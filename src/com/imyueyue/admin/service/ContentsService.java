package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ContentsModel;
import com.imyueyue.admin.model.ContentsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: contents)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentsService extends IBaseService<ContentsModel, Integer> {

    Page<ContentsModel> query(int pn, int pageSize, ContentsQueryModel command);
    
}



