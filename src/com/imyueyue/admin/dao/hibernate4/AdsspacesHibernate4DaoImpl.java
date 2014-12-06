package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.admin.dao.AdsspacesDao;
import com.imyueyue.admin.model.AdsspacesModel;
import com.imyueyue.admin.model.AdsspacesQueryModel;
import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;

/*
  @abstract(DB TableName: adsspaces)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:28)
  @cvs($Date: 2014/11/29 21:56:28 $)
*/ 

@Repository("AdsspacesDao")
public class AdsspacesHibernate4DaoImpl extends BaseHibernateDao<AdsspacesModel, Integer> implements AdsspacesDao {

    private static final String HQL_LIST = "from AdsspacesModel ";
    private static final String HQL_COUNT = "select count(*) from AdsspacesModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<AdsspacesModel> query(int pn, int pageSize, AdsspacesQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(AdsspacesQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(AdsspacesQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}



