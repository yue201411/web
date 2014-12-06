package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.ContenttagsDao;
import com.imyueyue.admin.model.ContenttagsModel;
import com.imyueyue.admin.model.ContenttagsQueryModel;
import com.imyueyue.admin.service.ContenttagsService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: contenttags)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("ContenttagsService")
public class ContenttagsServiceImpl extends BaseService<ContenttagsModel, Integer> implements ContenttagsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContenttagsServiceImpl.class);

    private ContenttagsDao contenttagsDao;

    @Autowired
    @Qualifier("ContenttagsDao")
    @Override
    public void setBaseDao(IBaseDao<ContenttagsModel, Integer> contenttagsDao) {
        this.baseDao = contenttagsDao;
        this.contenttagsDao = (ContenttagsDao) contenttagsDao;
    }
    

    @Override
    public Page<ContenttagsModel> query(int pn, int pageSize, ContenttagsQueryModel command) {
        return PageUtil.getPage(contenttagsDao.countQuery(command) ,pn, contenttagsDao.query(pn, pageSize, command), pageSize);
    }
   
}



