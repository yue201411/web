package com.imyueyue.admin.dao.hibernate4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imyueyue.common.dao.hibernate4.BaseHibernateDao;
import com.imyueyue.admin.dao.UsersDao;
import com.imyueyue.admin.model.UsersModel;
import com.imyueyue.admin.model.UsersQueryModel;

/*
  @abstract(DB TableName: users)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 22:11:16)
  @cvs($Date: 2014/12/7 22:11:16 $)
*/ 

@Repository("UsersDao")
public class UsersHibernate4DaoImpl extends BaseHibernateDao<UsersModel, Integer> implements UsersDao {

    private static final String HQL_LIST = "from UsersModel ";
    private static final String HQL_COUNT = "select count(*) from UsersModel ";

    private static final String HQL_LIST_QUERY_CONDITION = " ";//where 
    private static final String HQL_LIST_QUERY_ALL = HQL_LIST + HQL_LIST_QUERY_CONDITION + "order by id desc";
    private static final String HQL_COUNT_QUERY_ALL = HQL_COUNT + HQL_LIST_QUERY_CONDITION;

    @Override
    public List<UsersModel> query(int pn, int pageSize, UsersQueryModel command) {
        return list(HQL_LIST_QUERY_ALL, pn, pageSize, getQueryParam(command));
    }

    @Override
    public int countQuery(UsersQueryModel command) {
        return this.<Number>aggregate(HQL_COUNT_QUERY_ALL, getQueryParam(command)).intValue();
    }
    
    private Object[] getQueryParam(UsersQueryModel command) {
        //TODO 改成全文索引
        /*String usernameLikeStr = "%" + command.getUsername() + "%";
        return new Object[]{
            usernameLikeStr
        };
        */
        
        return null;
    }
    
    @Override
	public boolean checkUser(UsersQueryModel command) {
		List<UsersModel> ulist= this.query(0,1, command);
		
		if (ulist==null){
			return false;
		}
		UsersModel pwd = ulist.get(0);
		
		System.out.println(pwd.getPassword());
		
        return command.getPassword().equals(pwd.getPassword());
	}
   

}



