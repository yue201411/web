package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;
import com.imyueyue.admin.dao.ConfigsDao;
import com.imyueyue.admin.model.ConfigsModel;
import com.imyueyue.admin.model.ConfigsQueryModel;

/*
  @abstract(DB TableName: configs)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 22:11:15)
  @cvs($Date: 2014/12/7 22:11:15 $)
*/ 

@Repository("ConfigsDao")
public class ConfigsHibernate4DaoImpl extends BaseHibernateDao<ConfigsModel, Integer> implements ConfigsDao {

    private static final String HQL_LIST = "from ConfigsModel ";
    private static final String HQL_COUNT = "select count(*) from ConfigsModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<ConfigsModel> query(int pn, int pageSize, ConfigsQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(ConfigsQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(ConfigsQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}



