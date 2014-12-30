package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ContentchannelModel;
import com.imyueyue.admin.model.ContentchannelQueryModel;

/*
  @abstract(DB TableName: contentchannel)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentchannelDao extends IBaseDao<ContentchannelModel, Integer> {
    
    List<ContentchannelModel> query(int pn, int pageSize, ContentchannelQueryModel command);

    int countQuery(ContentchannelQueryModel command);

}  



