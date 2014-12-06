package com.imyueyue.admin.service;

import com.imyueyue.admin.model.SitesModel;
import com.imyueyue.admin.model.SitesQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: sites)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

public interface SitesService extends IBaseService<SitesModel, Integer> {

    Page<SitesModel> query(int pn, int pageSize, SitesQueryModel command);
    
}



