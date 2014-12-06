package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.admin.dao.ContentchannelDao;
import com.imyueyue.admin.model.ContentchannelModel;
import com.imyueyue.admin.model.ContentchannelQueryModel;
import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;

/*
  @abstract(DB TableName: contentchannel)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 21:56:29)
  @cvs($Date: 2014/11/29 21:56:29 $)
*/ 

@Repository("ContentchannelDao")
public class ContentchannelHibernate4DaoImpl extends BaseHibernateDao<ContentchannelModel, Integer> implements ContentchannelDao {

    private static final String HQL_LIST = "from ContentchannelModel ";
    private static final String HQL_COUNT = "select count(*) from ContentchannelModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<ContentchannelModel> query(int pn, int pageSize, ContentchannelQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(ContentchannelQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(ContentchannelQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}



