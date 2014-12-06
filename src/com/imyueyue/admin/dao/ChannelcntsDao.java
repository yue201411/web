package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ChannelcntsModel;
import com.imyueyue.admin.model.ChannelcntsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: channelcnts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ChannelcntsDao extends IBaseDao<ChannelcntsModel, Integer> {
    
    List<ChannelcntsModel> query(int pn, int pageSize, ChannelcntsQueryModel command);

    int countQuery(ChannelcntsQueryModel command);

}  



