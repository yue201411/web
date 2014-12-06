package com.imyueyue.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;
import com.imyueyue.demo.dao.UserDao;
import com.imyueyue.demo.model.UserModel;
import com.imyueyue.demo.model.UserQueryModel;
import com.imyueyue.demo.service.UserService;

/**
 * User: imyueyue
 * Date: 12-1-4 上午11:06
 * Version: 1.0
 */

@Service("UserService")
public class UserServiceImpl extends BaseService<UserModel, Integer> implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserDao userDao;

    @Autowired
    @Qualifier("UserDao")
    @Override
    public void setBaseDao(IBaseDao<UserModel, Integer> userDao) {
        this.baseDao = userDao;
        this.userDao = (UserDao) userDao;
    }
    

    @Override
    public Page<UserModel> query(int pn, int pageSize, UserQueryModel command) {
        return PageUtil.getPage(userDao.countQuery(command) ,pn, userDao.query(pn, pageSize, command), pageSize);
    }

	@Override
	public boolean checkUser(UserQueryModel command) {
		return userDao.checkUser(command);
	}

   
}