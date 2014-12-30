package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.RolepermissionsModel;
import com.imyueyue.admin.model.RolepermissionsQueryModel;

/*
  @abstract(DB TableName: rolepermissions)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface RolepermissionsService extends IBaseService<RolepermissionsModel, Integer> {

    Page<RolepermissionsModel> query(int pn, int pageSize, RolepermissionsQueryModel command);
    
}



