package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;
import com.imyueyue.admin.dao.RolesDao;
import com.imyueyue.admin.model.RolesModel;
import com.imyueyue.admin.model.RolesQueryModel;

/*
  @abstract(DB TableName: roles)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 22:11:16)
  @cvs($Date: 2014/12/7 22:11:16 $)
*/ 

@Repository("RolesDao")
public class RolesHibernate4DaoImpl extends BaseHibernateDao<RolesModel, Integer> implements RolesDao {

    private static final String HQL_LIST = "from RolesModel ";
    private static final String HQL_COUNT = "select count(*) from RolesModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<RolesModel> query(int pn, int pageSize, RolesQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(RolesQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(RolesQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}



