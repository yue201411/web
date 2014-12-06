package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.admin.model.ChannelsModel;
import com.imyueyue.admin.model.ChannelsQueryModel;
import com.imyueyue.common.dao.IBaseDao;

/*
  @abstract(DB TableName: channels)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

public interface ChannelsDao extends IBaseDao<ChannelsModel, Integer> {
    
    List<ChannelsModel> query(int pn, int pageSize, ChannelsQueryModel command);

    int countQuery(ChannelsQueryModel command);

}  



