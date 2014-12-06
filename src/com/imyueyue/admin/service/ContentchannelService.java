﻿package com.imyueyue.admin.service;

import com.imyueyue.admin.model.ContentchannelModel;
import com.imyueyue.admin.model.ContentchannelQueryModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;

/*
  @abstract(DB TableName: contentchannel)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ContentchannelService extends IBaseService<ContentchannelModel, Integer> {

    Page<ContentchannelModel> query(int pn, int pageSize, ContentchannelQueryModel command);
    
}


