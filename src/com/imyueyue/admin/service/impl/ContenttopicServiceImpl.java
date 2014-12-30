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
import com.imyueyue.admin.dao.ContenttopicDao;
import com.imyueyue.admin.model.ContenttopicModel;
import com.imyueyue.admin.model.ContenttopicQueryModel;
import com.imyueyue.admin.service.ContenttopicService;

/*
  @abstract(DB TableName: contenttopic)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

@Service("ContenttopicService")
public class ContenttopicServiceImpl extends BaseService<ContenttopicModel, Integer> implements ContenttopicService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContenttopicServiceImpl.class);

    private ContenttopicDao contenttopicDao;

    @Autowired
    @Qualifier("ContenttopicDao")
    @Override
    public void setBaseDao(IBaseDao<ContenttopicModel, Integer> contenttopicDao) {
        this.baseDao = contenttopicDao;
        this.contenttopicDao = (ContenttopicDao) contenttopicDao;
    }
    

    @Override
    public Page<ContenttopicModel> query(int pn, int pageSize, ContenttopicQueryModel command) {
        return PageUtil.getPage(contenttopicDao.countQuery(command) ,pn, contenttopicDao.query(pn, pageSize, command), pageSize);
    }
   
}



