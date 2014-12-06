package com.imyueyue.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.admin.dao.ModelsDao;
import com.imyueyue.admin.model.ModelsModel;
import com.imyueyue.admin.model.ModelsQueryModel;
import com.imyueyue.admin.service.ModelsService;
import com.imyueyue.common.dao.IBaseDao;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.impl.BaseService;

/*
  @abstract(DB TableName: models)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Service("ModelsService")
public class ModelsServiceImpl extends BaseService<ModelsModel, Integer> implements ModelsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModelsServiceImpl.class);

    private ModelsDao modelsDao;

    @Autowired
    @Qualifier("ModelsDao")
    @Override
    public void setBaseDao(IBaseDao<ModelsModel, Integer> modelsDao) {
        this.baseDao = modelsDao;
        this.modelsDao = (ModelsDao) modelsDao;
    }
    

    @Override
    public Page<ModelsModel> query(int pn, int pageSize, ModelsQueryModel command) {
        return PageUtil.getPage(modelsDao.countQuery(command) ,pn, modelsDao.query(pn, pageSize, command), pageSize);
    }
   
}



