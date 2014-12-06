package com.imyueyue.admin.service;

import com.imyueyue.admin.model.AdsspacesModel;
import com.imyueyue.admin.model.AdsspacesQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: adsspaces)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:28)
  @cvs($Date: 2014/11/29 21:56:28 $)
*/ 

public interface AdsspacesService extends IBaseService<AdsspacesModel, Integer> {

    Page<AdsspacesModel> query(int pn, int pageSize, AdsspacesQueryModel command);
    
}



