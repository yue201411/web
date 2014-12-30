package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ContentextsModel;
import com.imyueyue.admin.model.ContentextsQueryModel;

/*
  @abstract(DB TableName: contentexts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentextsDao extends IBaseDao<ContentextsModel, Integer> {
    
    List<ContentextsModel> query(int pn, int pageSize, ContentextsQueryModel command);

    int countQuery(ContentextsQueryModel command);

}  



