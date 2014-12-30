package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;
import com.imyueyue.admin.dao.ContentchannelDao;
import com.imyueyue.admin.model.ContentchannelModel;
import com.imyueyue.admin.model.ContentchannelQueryModel;
import com.imyueyue.admin.service.ContentchannelService;

/*
  @abstract(DB TableName: contentchannel)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

@Service("ContentchannelService")
public class ContentchannelServiceImpl extends BaseService<ContentchannelModel, Integer> implements ContentchannelService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentchannelServiceImpl.class);

    private ContentchannelDao contentchannelDao;

    @Autowired
    @Qualifier("ContentchannelDao")
    @Override
    public void setBaseDao(IBaseDao<ContentchannelModel, Integer> contentchannelDao) {
        this.baseDao = contentchannelDao;
        this.contentchannelDao = (ContentchannelDao) contentchannelDao;
    }
    

    @Override
    public Page<ContentchannelModel> query(int pn, int pageSize, ContentchannelQueryModel command) {
        return PageUtil.getPage(contentchannelDao.countQuery(command) ,pn, contentchannelDao.query(pn, pageSize, command), pageSize);
    }
   
}



