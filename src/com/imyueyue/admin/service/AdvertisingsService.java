package com.imyueyue.admin.service;

import com.imyueyue.admin.model.AdvertisingsModel;
import com.imyueyue.admin.model.AdvertisingsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: advertisings)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface AdvertisingsService extends IBaseService<AdvertisingsModel, Integer> {

    Page<AdvertisingsModel> query(int pn, int pageSize, AdvertisingsQueryModel command);
    
}



