package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ContentimgsModel;
import com.imyueyue.admin.model.ContentimgsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: contentimgs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentimgsDao extends IBaseDao<ContentimgsModel, Integer> {
    
    List<ContentimgsModel> query(int pn, int pageSize, ContentimgsQueryModel command);

    int countQuery(ContentimgsQueryModel command);

}  



