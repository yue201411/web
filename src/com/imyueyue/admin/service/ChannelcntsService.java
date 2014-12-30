package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ChannelcntsModel;
import com.imyueyue.admin.model.ChannelcntsQueryModel;

/*
  @abstract(DB TableName: channelcnts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface ChannelcntsService extends IBaseService<ChannelcntsModel, Integer> {

    Page<ChannelcntsModel> query(int pn, int pageSize, ChannelcntsQueryModel command);
    
}



