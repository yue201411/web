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
  @abstract(DB TableName: roles_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "roles")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RolesModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RoleID", nullable = false)
    private int roleID;
    
    
    private int siteID; //站点ID
    
    private String roleName; //角色名称
    private int isActive; //是否显示
    private int priority; //排序
        
    
    public int getRoleID() {
      return roleID;
    }
    
    public void setRoleID(int RoleID){
      this.roleID = RoleID;
    }
    
    
    public int getSiteID() {
      return siteID;
    }
    
    public void setSiteID(int SiteID){
      this.siteID = SiteID;
    }
    
    
    public String getRoleName() {
      return roleName;
    }
    
    public void setRoleName(String RoleName){
      this.roleName = RoleName;
    }
    
    public int getIsActive() {
      return isActive;
    }
    
    public void setIsActive(int IsActive){
      this.isActive = IsActive;
    }
    
    public int getPriority() {
      return priority;
    }
    
    public void setPriority(int Priority){
      this.priority = Priority;
    }
    
   

    
}  
  



