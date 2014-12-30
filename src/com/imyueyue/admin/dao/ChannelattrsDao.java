package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ChannelattrsModel;
import com.imyueyue.admin.model.ChannelattrsQueryModel;

/*
  @abstract(DB TableName: channelattrs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface ChannelattrsDao extends IBaseDao<ChannelattrsModel, Integer> {
    
    List<ChannelattrsModel> query(int pn, int pageSize, ChannelattrsQueryModel command);

    int countQuery(ChannelattrsQueryModel command);

}  



