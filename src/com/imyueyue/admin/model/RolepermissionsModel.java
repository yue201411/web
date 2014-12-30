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
  @abstract(DB TableName: rolepermissions_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "rolepermissions")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RolepermissionsModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RoleID", nullable = false)
    private int roleID;
    
    
    private String url; //链接地址
    
        
    
    public int getRoleID() {
      return roleID;
    }
    
    public void setRoleID(int RoleID){
      this.roleID = RoleID;
    }
    
    
    public String getUrl() {
      return url;
    }
    
    public void setUrl(String Url){
      this.url = Url;
    }
    
    
   

    
}  
  



