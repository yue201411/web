package com.imyueyue.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imyueyue.common.Constants;
import com.imyueyue.common.dao.ICommonDao;
import com.imyueyue.common.model.AbstractModel;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.pagination.PageUtil;
import com.imyueyue.common.service.ICommonService;

import java.io.Serializable;
import java.util.List;

@Service("CommonService")
public class CommonService implements ICommonService {
    
    @Autowired
    @Qualifier("CommonHibernateDao")
    private ICommonDao commonDao;


    @Override
	public <T extends AbstractModel> T save(T model) {
        return commonDao.save(model);
    }

    @Override
	public <T extends AbstractModel> void saveOrUpdate(T model) {
        commonDao.saveOrUpdate(model);
        
    }
    
    @Override
	public <T extends AbstractModel> void update(T model) {
        commonDao.update(model);
    }
    
    @Override
	public <T extends AbstractModel> void merge(T model) {
        commonDao.merge(model);
    }

    @Override
	public <T extends AbstractModel, PK extends Serializable> void delete(Class<T> entityClass, PK id) {
        commonDao.delete(entityClass, id);
    }

    @Override
	public <T extends AbstractModel> void deleteObject(T model) {
        commonDao.deleteObject(model);
    }

    @Override
	public <T extends AbstractModel, PK extends Serializable> T get(Class<T> entityClass, PK id) {
        return commonDao.get(entityClass, id);
        
    }
    
    @Override
	public <T extends AbstractModel> int countAll(Class<T> entityClass) {
        return commonDao.countAll(entityClass);
    }
    
    @Override
	public <T extends AbstractModel> List<T> listAll(Class<T> entityClass) {
        return commonDao.listAll(entityClass);
    }
    
    @Override
	public <T extends AbstractModel> Page<T> listAll(Class<T> entityClass, int pn) {
        return listAll(entityClass, pn, Constants.DEFAULT_PAGE_SIZE);
    }
    
    @Override
	public <T extends AbstractModel> Page<T> listAll(Class<T> entityClass, int pn, int pageSize) {
        int total = countAll(entityClass);
        List<T> items = commonDao.listAll(entityClass, pn, pageSize);
        return PageUtil.getPage(total, pn, items, pageSize);
    }

}
