package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.AdvattributesDao;
import com.imyueyue.admin.model.AdvattributesModel;
import com.imyueyue.admin.model.AdvattributesQueryModel;
import com.imyueyue.admin.service.AdvattributesService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: advattributes)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("AdvattributesService")
public class AdvattributesServiceImpl extends BaseService<AdvattributesModel, Integer> implements AdvattributesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdvattributesServiceImpl.class);

    private AdvattributesDao advattributesDao;

    @Autowired
    @Qualifier("AdvattributesDao")
    @Override
    public void setBaseDao(IBaseDao<AdvattributesModel, Integer> advattributesDao) {
        this.baseDao = advattributesDao;
        this.advattributesDao = (AdvattributesDao) advattributesDao;
    }
    

    @Override
    public Page<AdvattributesModel> query(int pn, int pageSize, AdvattributesQueryModel command) {
        return PageUtil.getPage(advattributesDao.countQuery(command) ,pn, advattributesDao.query(pn, pageSize, command), pageSize);
    }
   
}



