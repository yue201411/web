package com.imyueyue.admin.service;

import com.imyueyue.admin.model.RolepermissionsModel;
import com.imyueyue.admin.model.RolepermissionsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: rolepermissions)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface RolepermissionsService extends IBaseService<RolepermissionsModel, Integer> {

    Page<RolepermissionsModel> query(int pn, int pageSize, RolepermissionsQueryModel command);
    
}



