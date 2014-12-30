package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.AdvattributesModel;
import com.imyueyue.admin.model.AdvattributesQueryModel;

/*
  @abstract(DB TableName: advattributes)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface AdvattributesService extends IBaseService<AdvattributesModel, Integer> {

    Page<AdvattributesModel> query(int pn, int pageSize, AdvattributesQueryModel command);
    
}



