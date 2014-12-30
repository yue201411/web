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
import com.imyueyue.admin.dao.ContentattrsDao;
import com.imyueyue.admin.model.ContentattrsModel;
import com.imyueyue.admin.model.ContentattrsQueryModel;
import com.imyueyue.admin.service.ContentattrsService;

/*
  @abstract(DB TableName: contentattrs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 21:29:20)
  @cvs($Date: 2014/12/7 21:29:20 $)
*/ 

@Service("ContentattrsService")
public class ContentattrsServiceImpl extends BaseService<ContentattrsModel, Integer> implements ContentattrsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentattrsServiceImpl.class);

    private ContentattrsDao contentattrsDao;

    @Autowired
    @Qualifier("ContentattrsDao")
    @Override
    public void setBaseDao(IBaseDao<ContentattrsModel, Integer> contentattrsDao) {
        this.baseDao = contentattrsDao;
        this.contentattrsDao = (ContentattrsDao) contentattrsDao;
    }
    

    @Override
    public Page<ContentattrsModel> query(int pn, int pageSize, ContentattrsQueryModel command) {
        return PageUtil.getPage(contentattrsDao.countQuery(command) ,pn, contentattrsDao.query(pn, pageSize, command), pageSize);
    }
   
}



