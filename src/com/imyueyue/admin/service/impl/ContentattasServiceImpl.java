package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.ContentattasDao;
import com.imyueyue.admin.model.ContentattasModel;
import com.imyueyue.admin.model.ContentattasQueryModel;
import com.imyueyue.admin.service.ContentattasService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: contentattas)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("ContentattasService")
public class ContentattasServiceImpl extends BaseService<ContentattasModel, Integer> implements ContentattasService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentattasServiceImpl.class);

    private ContentattasDao contentattasDao;

    @Autowired
    @Qualifier("ContentattasDao")
    @Override
    public void setBaseDao(IBaseDao<ContentattasModel, Integer> contentattasDao) {
        this.baseDao = contentattasDao;
        this.contentattasDao = (ContentattasDao) contentattasDao;
    }
    

    @Override
    public Page<ContentattasModel> query(int pn, int pageSize, ContentattasQueryModel command) {
        return PageUtil.getPage(contentattasDao.countQuery(command) ,pn, contentattasDao.query(pn, pageSize, command), pageSize);
    }
   
}



