package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ChannelsModel;
import com.imyueyue.admin.model.ChannelsQueryModel;

/*
  @abstract(DB TableName: channels)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface ChannelsService extends IBaseService<ChannelsModel, Integer> {

    Page<ChannelsModel> query(int pn, int pageSize, ChannelsQueryModel command);
    
}



