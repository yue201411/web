package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.ContentsDao;
import com.imyueyue.admin.model.ContentsModel;
import com.imyueyue.admin.model.ContentsQueryModel;
import com.imyueyue.admin.service.ContentsService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: contents)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("ContentsService")
public class ContentsServiceImpl extends BaseService<ContentsModel, Integer> implements ContentsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentsServiceImpl.class);

    private ContentsDao contentsDao;

    @Autowired
    @Qualifier("ContentsDao")
    @Override
    public void setBaseDao(IBaseDao<ContentsModel, Integer> contentsDao) {
        this.baseDao = contentsDao;
        this.contentsDao = (ContentsDao) contentsDao;
    }
    

    @Override
    public Page<ContentsModel> query(int pn, int pageSize, ContentsQueryModel command) {
        return PageUtil.getPage(contentsDao.countQuery(command) ,pn, contentsDao.query(pn, pageSize, command), pageSize);
    }
   
}



