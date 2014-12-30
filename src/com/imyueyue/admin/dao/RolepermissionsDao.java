package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.RolepermissionsModel;
import com.imyueyue.admin.model.RolepermissionsQueryModel;

/*
  @abstract(DB TableName: rolepermissions)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface RolepermissionsDao extends IBaseDao<RolepermissionsModel, Integer> {
    
    List<RolepermissionsModel> query(int pn, int pageSize, RolepermissionsQueryModel command);

    int countQuery(RolepermissionsQueryModel command);

}  



