package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;
import com.imyueyue.admin.dao.AdvertisingsDao;
import com.imyueyue.admin.model.AdvertisingsModel;
import com.imyueyue.admin.model.AdvertisingsQueryModel;
import com.imyueyue.admin.service.AdvertisingsService;

/*
  @abstract(DB TableName: advertisings)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

@Service("AdvertisingsService")
public class AdvertisingsServiceImpl extends BaseService<AdvertisingsModel, Integer> implements AdvertisingsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdvertisingsServiceImpl.class);

    private AdvertisingsDao advertisingsDao;

    @Autowired
    @Qualifier("AdvertisingsDao")
    @Override
    public void setBaseDao(IBaseDao<AdvertisingsModel, Integer> advertisingsDao) {
        this.baseDao = advertisingsDao;
        this.advertisingsDao = (AdvertisingsDao) advertisingsDao;
    }
    

    @Override
    public Page<AdvertisingsModel> query(int pn, int pageSize, AdvertisingsQueryModel command) {
        return PageUtil.getPage(advertisingsDao.countQuery(command) ,pn, advertisingsDao.query(pn, pageSize, command), pageSize);
    }
   
}



