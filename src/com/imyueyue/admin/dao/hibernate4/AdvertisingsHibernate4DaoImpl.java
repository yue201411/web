package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.admin.dao.AdvertisingsDao;
import com.imyueyue.admin.model.AdvertisingsModel;
import com.imyueyue.admin.model.AdvertisingsQueryModel;
import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;

/*
  @abstract(DB TableName: advertisings)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Repository("AdvertisingsDao")
public class AdvertisingsHibernate4DaoImpl extends BaseHibernateDao<AdvertisingsModel, Integer> implements AdvertisingsDao {

    private static final String HQL_LIST = "from AdvertisingsModel ";
    private static final String HQL_COUNT = "select count(*) from AdvertisingsModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<AdvertisingsModel> query(int pn, int pageSize, AdvertisingsQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(AdvertisingsQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(AdvertisingsQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}



