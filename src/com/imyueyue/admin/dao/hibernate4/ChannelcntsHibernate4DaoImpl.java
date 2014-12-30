package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;
import com.imyueyue.admin.dao.ChannelcntsDao;
import com.imyueyue.admin.model.ChannelcntsModel;
import com.imyueyue.admin.model.ChannelcntsQueryModel;

/*
  @abstract(DB TableName: channelcnts)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 22:11:15)
  @cvs($Date: 2014/12/7 22:11:15 $)
*/ 

@Repository("ChannelcntsDao")
public class ChannelcntsHibernate4DaoImpl extends BaseHibernateDao<ChannelcntsModel, Integer> implements ChannelcntsDao {

    private static final String HQL_LIST = "from ChannelcntsModel ";
    private static final String HQL_COUNT = "select count(*) from ChannelcntsModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<ChannelcntsModel> query(int pn, int pageSize, ChannelcntsQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(ChannelcntsQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(ChannelcntsQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
   

}



