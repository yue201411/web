package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;
import com.imyueyue.admin.dao.SitesDao;
import com.imyueyue.admin.model.SitesModel;
import com.imyueyue.admin.model.SitesQueryModel;

/*
  @abstract(DB TableName: sites)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 22:11:16)
  @cvs($Date: 2014/12/7 22:11:16 $)
*/ 

@Repository("SitesDao")
public class SitesHibernate4DaoImpl extends BaseHibernateDao<SitesModel, Integer> implements SitesDao {

    private static final String HQL_LIST = "from SitesModel ";
    private static final String HQL_COUNT = "select count(*) from SitesModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<SitesModel> query(int pn, int pageSize, SitesQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(SitesQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(SitesQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}



