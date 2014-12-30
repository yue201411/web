package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ChannelattrsModel;
import com.imyueyue.admin.model.ChannelattrsQueryModel;

/*
  @abstract(DB TableName: channelattrs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface ChannelattrsService extends IBaseService<ChannelattrsModel, Integer> {

    Page<ChannelattrsModel> query(int pn, int pageSize, ChannelattrsQueryModel command);
    
}



