package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ContentattrsModel;
import com.imyueyue.admin.model.ContentattrsQueryModel;

/*
  @abstract(DB TableName: contentattrs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentattrsDao extends IBaseDao<ContentattrsModel, Integer> {
    
    List<ContentattrsModel> query(int pn, int pageSize, ContentattrsQueryModel command);

    int countQuery(ContentattrsQueryModel command);

}  



