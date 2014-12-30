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
import com.imyueyue.admin.dao.ContentchecksDao;
import com.imyueyue.admin.model.ContentchecksModel;
import com.imyueyue.admin.model.ContentchecksQueryModel;
import com.imyueyue.admin.service.ContentchecksService;

/*
  @abstract(DB TableName: contentchecks)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

@Service("ContentchecksService")
public class ContentchecksServiceImpl extends BaseService<ContentchecksModel, Integer> implements ContentchecksService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentchecksServiceImpl.class);

    private ContentchecksDao contentchecksDao;

    @Autowired
    @Qualifier("ContentchecksDao")
    @Override
    public void setBaseDao(IBaseDao<ContentchecksModel, Integer> contentchecksDao) {
        this.baseDao = contentchecksDao;
        this.contentchecksDao = (ContentchecksDao) contentchecksDao;
    }
    

    @Override
    public Page<ContentchecksModel> query(int pn, int pageSize, ContentchecksQueryModel command) {
        return PageUtil.getPage(contentchecksDao.countQuery(command) ,pn, contentchecksDao.query(pn, pageSize, command), pageSize);
    }
   
}



