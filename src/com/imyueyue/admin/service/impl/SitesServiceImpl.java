package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.SitesDao;
import com.imyueyue.admin.model.SitesModel;
import com.imyueyue.admin.model.SitesQueryModel;
import com.imyueyue.admin.service.SitesService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: sites)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

@Service("SitesService")
public class SitesServiceImpl extends BaseService<SitesModel, Integer> implements SitesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SitesServiceImpl.class);

    private SitesDao sitesDao;

    @Autowired
    @Qualifier("SitesDao")
    @Override
    public void setBaseDao(IBaseDao<SitesModel, Integer> sitesDao) {
        this.baseDao = sitesDao;
        this.sitesDao = (SitesDao) sitesDao;
    }
    

    @Override
    public Page<SitesModel> query(int pn, int pageSize, SitesQueryModel command) {
        return PageUtil.getPage(sitesDao.countQuery(command) ,pn, sitesDao.query(pn, pageSize, command), pageSize);
    }
   
}



