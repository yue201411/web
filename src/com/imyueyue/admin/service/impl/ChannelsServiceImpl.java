package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.ChannelsDao;
import com.imyueyue.admin.model.ChannelsModel;
import com.imyueyue.admin.model.ChannelsQueryModel;
import com.imyueyue.admin.service.ChannelsService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: channels)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("ChannelsService")
public class ChannelsServiceImpl extends BaseService<ChannelsModel, Integer> implements ChannelsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChannelsServiceImpl.class);

    private ChannelsDao channelsDao;

    @Autowired
    @Qualifier("ChannelsDao")
    @Override
    public void setBaseDao(IBaseDao<ChannelsModel, Integer> channelsDao) {
        this.baseDao = channelsDao;
        this.channelsDao = (ChannelsDao) channelsDao;
    }
    

    @Override
    public Page<ChannelsModel> query(int pn, int pageSize, ChannelsQueryModel command) {
        return PageUtil.getPage(channelsDao.countQuery(command) ,pn, channelsDao.query(pn, pageSize, command), pageSize);
    }
   
}



