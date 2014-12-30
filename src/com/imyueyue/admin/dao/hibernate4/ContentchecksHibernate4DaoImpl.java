package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;
import com.imyueyue.admin.dao.ContentchecksDao;
import com.imyueyue.admin.model.ContentchecksModel;
import com.imyueyue.admin.model.ContentchecksQueryModel;

/*
  @abstract(DB TableName: contentchecks)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 22:11:15)
  @cvs($Date: 2014/12/7 22:11:15 $)
*/ 

@Repository("ContentchecksDao")
public class ContentchecksHibernate4DaoImpl extends BaseHibernateDao<ContentchecksModel, Integer> implements ContentchecksDao {

    private static final String HQL_LIST = "from ContentchecksModel ";
    private static final String HQL_COUNT = "select count(*) from ContentchecksModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<ContentchecksModel> query(int pn, int pageSize, ContentchecksQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(ContentchecksQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(ContentchecksQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}



