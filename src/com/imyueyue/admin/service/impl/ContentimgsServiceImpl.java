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
import com.imyueyue.admin.dao.ContentimgsDao;
import com.imyueyue.admin.model.ContentimgsModel;
import com.imyueyue.admin.model.ContentimgsQueryModel;
import com.imyueyue.admin.service.ContentimgsService;

/*
  @abstract(DB TableName: contentimgs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

@Service("ContentimgsService")
public class ContentimgsServiceImpl extends BaseService<ContentimgsModel, Integer> implements ContentimgsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentimgsServiceImpl.class);

    private ContentimgsDao contentimgsDao;

    @Autowired
    @Qualifier("ContentimgsDao")
    @Override
    public void setBaseDao(IBaseDao<ContentimgsModel, Integer> contentimgsDao) {
        this.baseDao = contentimgsDao;
        this.contentimgsDao = (ContentimgsDao) contentimgsDao;
    }
    

    @Override
    public Page<ContentimgsModel> query(int pn, int pageSize, ContentimgsQueryModel command) {
        return PageUtil.getPage(contentimgsDao.countQuery(command) ,pn, contentimgsDao.query(pn, pageSize, command), pageSize);
    }
   
}



