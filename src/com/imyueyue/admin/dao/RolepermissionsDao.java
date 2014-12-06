package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.RolepermissionsModel;
import com.imyueyue.admin.model.RolepermissionsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: rolepermissions)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface RolepermissionsDao extends IBaseDao<RolepermissionsModel, Integer> {
    
    List<RolepermissionsModel> query(int pn, int pageSize, RolepermissionsQueryModel command);

    int countQuery(RolepermissionsQueryModel command);

}  



