package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.AdsspacesModel;
import com.imyueyue.admin.model.AdsspacesQueryModel;

/*
  @abstract(DB TableName: adsspaces)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface AdsspacesService extends IBaseService<AdsspacesModel, Integer> {

    Page<AdsspacesModel> query(int pn, int pageSize, AdsspacesQueryModel command);
    
}



