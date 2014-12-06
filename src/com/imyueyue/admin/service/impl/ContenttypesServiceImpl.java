package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.ContenttypesDao;
import com.imyueyue.admin.model.ContenttypesModel;
import com.imyueyue.admin.model.ContenttypesQueryModel;
import com.imyueyue.admin.service.ContenttypesService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: contenttypes)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("ContenttypesService")
public class ContenttypesServiceImpl extends BaseService<ContenttypesModel, Integer> implements ContenttypesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContenttypesServiceImpl.class);

    private ContenttypesDao contenttypesDao;

    @Autowired
    @Qualifier("ContenttypesDao")
    @Override
    public void setBaseDao(IBaseDao<ContenttypesModel, Integer> contenttypesDao) {
        this.baseDao = contenttypesDao;
        this.contenttypesDao = (ContenttypesDao) contenttypesDao;
    }
    

    @Override
    public Page<ContenttypesModel> query(int pn, int pageSize, ContenttypesQueryModel command) {
        return PageUtil.getPage(contenttypesDao.countQuery(command) ,pn, contenttypesDao.query(pn, pageSize, command), pageSize);
    }
   
}



