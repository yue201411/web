package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.AdsspacesDao;
import com.imyueyue.admin.model.AdsspacesModel;
import com.imyueyue.admin.model.AdsspacesQueryModel;
import com.imyueyue.admin.service.AdsspacesService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: adsspaces)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("AdsspacesService")
public class AdsspacesServiceImpl extends BaseService<AdsspacesModel, Integer> implements AdsspacesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdsspacesServiceImpl.class);

    private AdsspacesDao adsspacesDao;

    @Autowired
    @Qualifier("AdsspacesDao")
    @Override
    public void setBaseDao(IBaseDao<AdsspacesModel, Integer> adsspacesDao) {
        this.baseDao = adsspacesDao;
        this.adsspacesDao = (AdsspacesDao) adsspacesDao;
    }
    

    @Override
    public Page<AdsspacesModel> query(int pn, int pageSize, AdsspacesQueryModel command) {
        return PageUtil.getPage(adsspacesDao.countQuery(command) ,pn, adsspacesDao.query(pn, pageSize, command), pageSize);
    }
   
}



