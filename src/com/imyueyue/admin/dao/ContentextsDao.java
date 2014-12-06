package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ContentextsModel;
import com.imyueyue.admin.model.ContentextsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: contentexts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentextsDao extends IBaseDao<ContentextsModel, Integer> {
    
    List<ContentextsModel> query(int pn, int pageSize, ContentextsQueryModel command);

    int countQuery(ContentextsQueryModel command);

}  



