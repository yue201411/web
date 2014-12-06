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
  @abstract(DB TableName: userauths_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 22:01:54)
  @cvs($Date: 2014/11/29 22:01:54 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "userauths")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserauthsModel extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    private String userName; //用户名
    private String email; //邮件地址
    private Date regTime; //注册时间
    private String regIP; //注册IP地址
    private Date lastTime; //最后登录时间
    private int loginCount; //登录次数
    private int isAdmin; //是否管理员
    private int isActive; //是否激活
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    public String getUserName() {
      return userName;
    }
    
    public void setUserName(String UserName){
      this.userName = UserName;
    }
    
    public String getEmail() {
      return email;
    }
    
    public void setEmail(String Email){
      this.email = Email;
    }
    
    public Date getRegTime() {
      return regTime;
    }
    
    public void setRegTime(Date RegTime){
      this.regTime = RegTime;
    }
    
    public String getRegIP() {
      return regIP;
    }
    
    public void setRegIP(String RegIP){
      this.regIP = RegIP;
    }
    
    public Date getLastTime() {
      return lastTime;
    }
    
    public void setLastTime(Date LastTime){
      this.lastTime = LastTime;
    }
    
    public int getLoginCount() {
      return loginCount;
    }
    
    public void setLoginCount(int LoginCount){
      this.loginCount = LoginCount;
    }
    
    public int getIsAdmin() {
      return isAdmin;
    }
    
    public void setIsAdmin(int IsAdmin){
      this.isAdmin = IsAdmin;
    }
    
    public int getIsActive() {
      return isActive;
    }
    
    public void setIsActive(int IsActive){
      this.isActive = IsActive;
    }
    
   

    
}  
  



