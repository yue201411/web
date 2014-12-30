package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ChannelcntsModel;
import com.imyueyue.admin.model.ChannelcntsQueryModel;

/*
  @abstract(DB TableName: channelcnts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface ChannelcntsDao extends IBaseDao<ChannelcntsModel, Integer> {
    
    List<ChannelcntsModel> query(int pn, int pageSize, ChannelcntsQueryModel command);

    int countQuery(ChannelcntsQueryModel command);

}  



