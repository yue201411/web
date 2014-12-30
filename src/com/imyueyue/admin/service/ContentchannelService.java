package com.imyueyue.admin.service;

import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.service.IBaseService;
import com.imyueyue.admin.model.ContentchannelModel;
import com.imyueyue.admin.model.ContentchannelQueryModel;

/*
  @abstract(DB TableName: contentchannel)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

public interface ContentchannelService extends IBaseService<ContentchannelModel, Integer> {

    Page<ContentchannelModel> query(int pn, int pageSize, ContentchannelQueryModel command);
    
}



