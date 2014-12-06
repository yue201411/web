package com.imyueyue.admin.service;

import com.imyueyue.admin.model.AdvattributesModel;
import com.imyueyue.admin.model.AdvattributesQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: advattributes)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface AdvattributesService extends IBaseService<AdvattributesModel, Integer> {

    Page<AdvattributesModel> query(int pn, int pageSize, AdvattributesQueryModel command);
    
}



