package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ChannelattrsModel;
import com.imyueyue.admin.model.ChannelattrsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: channelattrs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ChannelattrsDao extends IBaseDao<ChannelattrsModel, Integer> {
    
    List<ChannelattrsModel> query(int pn, int pageSize, ChannelattrsQueryModel command);

    int countQuery(ChannelattrsQueryModel command);

}  



