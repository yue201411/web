package com.imyueyue.demo.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.demo.model.UserModel;
import com.imyueyue.demo.model.UserQueryModel;

/**
 * User: imyueyue
 * Date: 12-1-4 上午10:13
 * Version: 1.0
 */
public interface UserService extends IBaseService<UserModel, Integer> {

    Page<UserModel> query(int pn, int pageSize, UserQueryModel command);
    
    boolean checkUser( UserQueryModel command);
}
