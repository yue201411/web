package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.ChannelattrsDao;
import com.imyueyue.admin.model.ChannelattrsModel;
import com.imyueyue.admin.model.ChannelattrsQueryModel;
import com.imyueyue.admin.service.ChannelattrsService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: channelattrs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("ChannelattrsService")
public class ChannelattrsServiceImpl extends BaseService<ChannelattrsModel, Integer> implements ChannelattrsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChannelattrsServiceImpl.class);

    private ChannelattrsDao channelattrsDao;

    @Autowired
    @Qualifier("ChannelattrsDao")
    @Override
    public void setBaseDao(IBaseDao<ChannelattrsModel, Integer> channelattrsDao) {
        this.baseDao = channelattrsDao;
        this.channelattrsDao = (ChannelattrsDao) channelattrsDao;
    }
    

    @Override
    public Page<ChannelattrsModel> query(int pn, int pageSize, ChannelattrsQueryModel command) {
        return PageUtil.getPage(channelattrsDao.countQuery(command) ,pn, channelattrsDao.query(pn, pageSize, command), pageSize);
    }
   
}



