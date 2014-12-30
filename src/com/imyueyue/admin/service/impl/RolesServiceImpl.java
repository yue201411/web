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
import com.imyueyue.admin.dao.RolesDao;
import com.imyueyue.admin.model.RolesModel;
import com.imyueyue.admin.model.RolesQueryModel;
import com.imyueyue.admin.service.RolesService;

/*
  @abstract(DB TableName: roles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

@Service("RolesService")
public class RolesServiceImpl extends BaseService<RolesModel, Integer> implements RolesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RolesServiceImpl.class);

    private RolesDao rolesDao;

    @Autowired
    @Qualifier("RolesDao")
    @Override
    public void setBaseDao(IBaseDao<RolesModel, Integer> rolesDao) {
        this.baseDao = rolesDao;
        this.rolesDao = (RolesDao) rolesDao;
    }
    

    @Override
    public Page<RolesModel> query(int pn, int pageSize, RolesQueryModel command) {
        return PageUtil.getPage(rolesDao.countQuery(command) ,pn, rolesDao.query(pn, pageSize, command), pageSize);
    }
   
}



