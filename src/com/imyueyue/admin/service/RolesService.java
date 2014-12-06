package com.imyueyue.admin.service;

import com.imyueyue.admin.model.RolesModel;
import com.imyueyue.admin.model.RolesQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: roles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

public interface RolesService extends IBaseService<RolesModel, Integer> {

    Page<RolesModel> query(int pn, int pageSize, RolesQueryModel command);
    
}



