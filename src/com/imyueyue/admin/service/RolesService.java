package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.RolesModel;
import com.imyueyue.admin.model.RolesQueryModel;

/*
  @abstract(DB TableName: roles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface RolesService extends IBaseService<RolesModel, Integer> {

    Page<RolesModel> query(int pn, int pageSize, RolesQueryModel command);
    
}



