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
import com.imyueyue.admin.dao.ConfigsDao;
import com.imyueyue.admin.model.ConfigsModel;
import com.imyueyue.admin.model.ConfigsQueryModel;
import com.imyueyue.admin.service.ConfigsService;

/*
  @abstract(DB TableName: configs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

@Service("ConfigsService")
public class ConfigsServiceImpl extends BaseService<ConfigsModel, Integer> implements ConfigsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigsServiceImpl.class);

    private ConfigsDao configsDao;

    @Autowired
    @Qualifier("ConfigsDao")
    @Override
    public void setBaseDao(IBaseDao<ConfigsModel, Integer> configsDao) {
        this.baseDao = configsDao;
        this.configsDao = (ConfigsDao) configsDao;
    }
    

    @Override
    public Page<ConfigsModel> query(int pn, int pageSize, ConfigsQueryModel command) {
        return PageUtil.getPage(configsDao.countQuery(command) ,pn, configsDao.query(pn, pageSize, command), pageSize);
    }
   
}



