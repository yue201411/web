package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.SitesModel;
import com.imyueyue.admin.model.SitesQueryModel;

/*
  @abstract(DB TableName: sites)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface SitesService extends IBaseService<SitesModel, Integer> {

    Page<SitesModel> query(int pn, int pageSize, SitesQueryModel command);
    
}



