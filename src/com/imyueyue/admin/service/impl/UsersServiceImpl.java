﻿package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;
import com.imyueyue.admin.dao.UsersDao;
import com.imyueyue.admin.model.UsersModel;
import com.imyueyue.admin.model.UsersQueryModel;
import com.imyueyue.admin.service.UsersService;

/*
  @abstract(DB TableName: users)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

@Service("UsersService")
public class UsersServiceImpl extends BaseService<UsersModel, Integer> implements UsersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsersServiceImpl.class);

    private UsersDao usersDao;

    @Autowired
    @Qualifier("UsersDao")
    @Override
    public void setBaseDao(IBaseDao<UsersModel, Integer> usersDao) {
        this.baseDao = usersDao;
        this.usersDao = (UsersDao) usersDao;
    }
    
    @Override
	public boolean checkUser(UsersQueryModel command) {
		return usersDao.checkUser(command);
	}

    

    @Override
    public Page<UsersModel> query(int pn, int pageSize, UsersQueryModel command) {
        return PageUtil.getPage(usersDao.countQuery(command) ,pn, usersDao.query(pn, pageSize, command), pageSize);
    }
   
}



