﻿package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.admin.dao.ContentattasDao;
import com.imyueyue.admin.model.ContentattasModel;
import com.imyueyue.admin.model.ContentattasQueryModel;
import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;

/*
  @abstract(DB TableName: contentattas)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Repository("ContentattasDao")
public class ContentattasHibernate4DaoImpl extends BaseHibernateDao<ContentattasModel, Integer> implements ContentattasDao {

    private static final String HQL_LIST = "from ContentattasModel ";
    private static final String HQL_COUNT = "select count(*) from ContentattasModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<ContentattasModel> query(int pn, int pageSize, ContentattasQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(ContentattasQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(ContentattasQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}


