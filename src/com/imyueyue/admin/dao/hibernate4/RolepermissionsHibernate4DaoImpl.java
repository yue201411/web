package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;
import com.imyueyue.admin.dao.RolepermissionsDao;
import com.imyueyue.admin.model.RolepermissionsModel;
import com.imyueyue.admin.model.RolepermissionsQueryModel;

/*
  @abstract(DB TableName: rolepermissions)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 22:11:16)
  @cvs($Date: 2014/12/7 22:11:16 $)
*/ 

@Repository("RolepermissionsDao")
public class RolepermissionsHibernate4DaoImpl extends BaseHibernateDao<RolepermissionsModel, Integer> implements RolepermissionsDao {

    private static final String HQL_LIST = "from RolepermissionsModel ";
    private static final String HQL_COUNT = "select count(*) from RolepermissionsModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<RolepermissionsModel> query(int pn, int pageSize, RolepermissionsQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(RolepermissionsQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(RolepermissionsQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}



