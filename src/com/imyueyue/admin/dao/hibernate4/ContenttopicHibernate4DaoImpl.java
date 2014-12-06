package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.admin.dao.ContenttopicDao;
import com.imyueyue.admin.model.ContenttopicModel;
import com.imyueyue.admin.model.ContenttopicQueryModel;
import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;

/*
  @abstract(DB TableName: contenttopic)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Repository("ContenttopicDao")
public class ContenttopicHibernate4DaoImpl extends BaseHibernateDao<ContenttopicModel, Integer> implements ContenttopicDao {

    private static final String HQL_LIST = "from ContenttopicModel ";
    private static final String HQL_COUNT = "select count(*) from ContenttopicModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<ContenttopicModel> query(int pn, int pageSize, ContenttopicQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(ContenttopicQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(ContenttopicQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}



