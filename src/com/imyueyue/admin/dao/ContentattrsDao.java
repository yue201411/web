package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ContentattrsModel;
import com.imyueyue.admin.model.ContentattrsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: contentattrs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentattrsDao extends IBaseDao<ContentattrsModel, Integer> {
    
    List<ContentattrsModel> query(int pn, int pageSize, ContentattrsQueryModel command);

    int countQuery(ContentattrsQueryModel command);

}  



