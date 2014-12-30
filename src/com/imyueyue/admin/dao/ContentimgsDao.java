package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ContentimgsModel;
import com.imyueyue.admin.model.ContentimgsQueryModel;

/*
  @abstract(DB TableName: contentimgs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentimgsDao extends IBaseDao<ContentimgsModel, Integer> {
    
    List<ContentimgsModel> query(int pn, int pageSize, ContentimgsQueryModel command);

    int countQuery(ContentimgsQueryModel command);

}  



