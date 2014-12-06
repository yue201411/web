package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ChannelsModel;
import com.imyueyue.admin.model.ChannelsQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: channels)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ChannelsService extends IBaseService<ChannelsModel, Integer> {

    Page<ChannelsModel> query(int pn, int pageSize, ChannelsQueryModel command);
    
}



