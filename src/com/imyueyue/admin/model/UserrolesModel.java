package com.imyueyue.admin.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.imyueyue.common.model.AbstractModel;

/*
  @abstract(DB TableName: userroles_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "userroles")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserrolesModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RoleID", nullable = false)
    private int roleID;
    
    
    private int userID; //用户ID
    
        
    
    public int getRoleID() {
      return roleID;
    }
    
    public void setRoleID(int RoleID){
      this.roleID = RoleID;
    }
    
    
    public int getUserID() {
      return userID;
    }
    
    public void setUserID(int UserID){
      this.userID = UserID;
    }
    
    
   

    
}  
  



