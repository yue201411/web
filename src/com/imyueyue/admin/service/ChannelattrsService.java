package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ChannelattrsModel;
import com.imyueyue.admin.model.ChannelattrsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: channelattrs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ChannelattrsService extends IBaseService<ChannelattrsModel, Integer> {

    Page<ChannelattrsModel> query(int pn, int pageSize, ChannelattrsQueryModel command);
    
}



