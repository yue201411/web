package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ContentsModel;
import com.imyueyue.admin.model.ContentsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: contents)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentsDao extends IBaseDao<ContentsModel, Integer> {
    
    List<ContentsModel> query(int pn, int pageSize, ContentsQueryModel command);

    int countQuery(ContentsQueryModel command);

}  



