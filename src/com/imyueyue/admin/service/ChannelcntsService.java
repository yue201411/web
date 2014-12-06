package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ChannelcntsModel;
import com.imyueyue.admin.model.ChannelcntsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: channelcnts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ChannelcntsService extends IBaseService<ChannelcntsModel, Integer> {

    Page<ChannelcntsModel> query(int pn, int pageSize, ChannelcntsQueryModel command);
    
}



