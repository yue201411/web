package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.UserauthsDao;
import com.imyueyue.admin.model.UserauthsModel;
import com.imyueyue.admin.model.UserauthsQueryModel;
import com.imyueyue.admin.service.UserauthsService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: userauths)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

@Service("UserauthsService")
public class UserauthsServiceImpl extends BaseService<UserauthsModel, Integer> implements UserauthsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserauthsServiceImpl.class);

    private UserauthsDao userauthsDao;

    @Autowired
    @Qualifier("UserauthsDao")
    @Override
    public void setBaseDao(IBaseDao<UserauthsModel, Integer> userauthsDao) {
        this.baseDao = userauthsDao;
        this.userauthsDao = (UserauthsDao) userauthsDao;
    }
    

    @Override
    public Page<UserauthsModel> query(int pn, int pageSize, UserauthsQueryModel command) {
        return PageUtil.getPage(userauthsDao.countQuery(command) ,pn, userauthsDao.query(pn, pageSize, command), pageSize);
    }
   
}



