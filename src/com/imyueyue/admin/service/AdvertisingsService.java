package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.AdvertisingsModel;
import com.imyueyue.admin.model.AdvertisingsQueryModel;

/*
  @abstract(DB TableName: advertisings)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface AdvertisingsService extends IBaseService<AdvertisingsModel, Integer> {

    Page<AdvertisingsModel> query(int pn, int pageSize, AdvertisingsQueryModel command);
    
}



