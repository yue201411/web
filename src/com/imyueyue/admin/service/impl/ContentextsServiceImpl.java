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
import com.imyueyue.admin.dao.ContentextsDao;
import com.imyueyue.admin.model.ContentextsModel;
import com.imyueyue.admin.model.ContentextsQueryModel;
import com.imyueyue.admin.service.ContentextsService;

/*
  @abstract(DB TableName: contentexts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

@Service("ContentextsService")
public class ContentextsServiceImpl extends BaseService<ContentextsModel, Integer> implements ContentextsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentextsServiceImpl.class);

    private ContentextsDao contentextsDao;

    @Autowired
    @Qualifier("ContentextsDao")
    @Override
    public void setBaseDao(IBaseDao<ContentextsModel, Integer> contentextsDao) {
        this.baseDao = contentextsDao;
        this.contentextsDao = (ContentextsDao) contentextsDao;
    }
    

    @Override
    public Page<ContentextsModel> query(int pn, int pageSize, ContentextsQueryModel command) {
        return PageUtil.getPage(contentextsDao.countQuery(command) ,pn, contentextsDao.query(pn, pageSize, command), pageSize);
    }
   
}



