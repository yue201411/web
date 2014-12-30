package com.imyueyue.admin.dao;

import java.util.List;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.admin.model.ChannelsModel;
import com.imyueyue.admin.model.ChannelsQueryModel;

/*
  @abstract(DB TableName: channels)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:19)
  @cvs($Date: 2014/12/7 21:29:19 $)
*/ 

public interface ChannelsDao extends IBaseDao<ChannelsModel, Integer> {
    
    List<ChannelsModel> query(int pn, int pageSize, ChannelsQueryModel command);

    int countQuery(ChannelsQueryModel command);

}  



