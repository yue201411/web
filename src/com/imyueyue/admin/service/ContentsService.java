package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ContentsModel;
import com.imyueyue.admin.model.ContentsQueryModel;

/*
  @abstract(DB TableName: contents)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentsService extends IBaseService<ContentsModel, Integer> {

    Page<ContentsModel> query(int pn, int pageSize, ContentsQueryModel command);
    
}



