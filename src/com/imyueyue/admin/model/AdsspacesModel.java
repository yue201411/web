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
  @abstract(DB TableName: adsspaces_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:54)
  @cvs($Date: 2014/12/7 23:52:54 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "adsspaces")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AdsspacesModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AdvID", nullable = false)
    private int advID;
    
    
    private int siteID; //网站ID
    
    private String advName; //广告名称
    private String description; //位置说明
    private int isActive; //是否激活
        
    
    public int getAdvID() {
      return advID;
    }
    
    public void setAdvID(int AdvID){
      this.advID = AdvID;
    }
    
    
    public int getSiteID() {
      return siteID;
    }
    
    public void setSiteID(int SiteID){
      this.siteID = SiteID;
    }
    
    
    public String getAdvName() {
      return advName;
    }
    
    public void setAdvName(String AdvName){
      this.advName = AdvName;
    }
    
    public String getDescription() {
      return description;
    }
    
    public void setDescription(String Description){
      this.description = Description;
    }
    
    public int getIsActive() {
      return isActive;
    }
    
    public void setIsActive(int IsActive){
      this.isActive = IsActive;
    }
    
   

    
}  
  



