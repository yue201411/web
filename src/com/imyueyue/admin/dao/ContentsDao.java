package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ContentsModel;
import com.imyueyue.admin.model.ContentsQueryModel;

/*
  @abstract(DB TableName: contents)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentsDao extends IBaseDao<ContentsModel, Integer> {
    
    List<ContentsModel> query(int pn, int pageSize, ContentsQueryModel command);

    int countQuery(ContentsQueryModel command);

}  



