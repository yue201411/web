package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.ChannelcntsDao;
import com.imyueyue.admin.model.ChannelcntsModel;
import com.imyueyue.admin.model.ChannelcntsQueryModel;
import com.imyueyue.admin.service.ChannelcntsService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: channelcnts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("ChannelcntsService")
public class ChannelcntsServiceImpl extends BaseService<ChannelcntsModel, Integer> implements ChannelcntsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChannelcntsServiceImpl.class);

    private ChannelcntsDao channelcntsDao;

    @Autowired
    @Qualifier("ChannelcntsDao")
    @Override
    public void setBaseDao(IBaseDao<ChannelcntsModel, Integer> channelcntsDao) {
        this.baseDao = channelcntsDao;
        this.channelcntsDao = (ChannelcntsDao) channelcntsDao;
    }
    

    @Override
    public Page<ChannelcntsModel> query(int pn, int pageSize, ChannelcntsQueryModel command) {
        return PageUtil.getPage(channelcntsDao.countQuery(command) ,pn, channelcntsDao.query(pn, pageSize, command), pageSize);
    }
   
}



