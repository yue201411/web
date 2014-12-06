package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.UserrolesDao;
import com.imyueyue.admin.model.UserrolesModel;
import com.imyueyue.admin.model.UserrolesQueryModel;
import com.imyueyue.admin.service.UserrolesService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: userroles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:30)
  @cvs($Date: 2014/11/29 21:56:30 $)
*/ 

@Service("UserrolesService")
public class UserrolesServiceImpl extends BaseService<UserrolesModel, Integer> implements UserrolesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserrolesServiceImpl.class);

    private UserrolesDao userrolesDao;

    @Autowired
    @Qualifier("UserrolesDao")
    @Override
    public void setBaseDao(IBaseDao<UserrolesModel, Integer> userrolesDao) {
        this.baseDao = userrolesDao;
        this.userrolesDao = (UserrolesDao) userrolesDao;
    }
    

    @Override
    public Page<UserrolesModel> query(int pn, int pageSize, UserrolesQueryModel command) {
        return PageUtil.getPage(userrolesDao.countQuery(command) ,pn, userrolesDao.query(pn, pageSize, command), pageSize);
    }
   
}



