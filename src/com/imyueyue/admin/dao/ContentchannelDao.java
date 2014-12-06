package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ContentchannelModel;
import com.imyueyue.admin.model.ContentchannelQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: contentchannel)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentchannelDao extends IBaseDao<ContentchannelModel, Integer> {
    
    List<ContentchannelModel> query(int pn, int pageSize, ContentchannelQueryModel command);

    int countQuery(ContentchannelQueryModel command);

}  



