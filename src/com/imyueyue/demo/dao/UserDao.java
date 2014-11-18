package com.imyueyue.demo.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.demo.model.UserModel;
import com.imyueyue.demo.model.UserQueryModel;


public interface UserDao extends IBaseDao<UserModel, Integer> {
    
    List<UserModel> query(int pn, int pageSize, UserQueryModel command);

    int countQuery(UserQueryModel command);
    
    boolean checkUser(UserQueryModel command);

}
