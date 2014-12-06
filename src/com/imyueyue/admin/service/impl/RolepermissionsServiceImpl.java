package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.RolepermissionsDao;
import com.imyueyue.admin.model.RolepermissionsModel;
import com.imyueyue.admin.model.RolepermissionsQueryModel;
import com.imyueyue.admin.service.RolepermissionsService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: rolepermissions)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("RolepermissionsService")
public class RolepermissionsServiceImpl extends BaseService<RolepermissionsModel, Integer> implements RolepermissionsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RolepermissionsServiceImpl.class);

    private RolepermissionsDao rolepermissionsDao;

    @Autowired
    @Qualifier("RolepermissionsDao")
    @Override
    public void setBaseDao(IBaseDao<RolepermissionsModel, Integer> rolepermissionsDao) {
        this.baseDao = rolepermissionsDao;
        this.rolepermissionsDao = (RolepermissionsDao) rolepermissionsDao;
    }
    

    @Override
    public Page<RolepermissionsModel> query(int pn, int pageSize, RolepermissionsQueryModel command) {
        return PageUtil.getPage(rolepermissionsDao.countQuery(command) ,pn, rolepermissionsDao.query(pn, pageSize, command), pageSize);
    }
   
}



