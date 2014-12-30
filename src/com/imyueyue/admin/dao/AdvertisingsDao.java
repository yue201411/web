package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.AdvertisingsModel;
import com.imyueyue.admin.model.AdvertisingsQueryModel;

/*
  @abstract(DB TableName: advertisings)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface AdvertisingsDao extends IBaseDao<AdvertisingsModel, Integer> {
    
    List<AdvertisingsModel> query(int pn, int pageSize, AdvertisingsQueryModel command);

    int countQuery(AdvertisingsQueryModel command);

}  



