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
  @abstract(DB TableName: contentchecks_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "contentchecks")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContentchecksModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ContentID", nullable = false)
    private int contentID;
    
    
    private int level; //审核级别
    private String status; //审核意见
    private int isRejected; //审核结果
        
    
    public int getContentID() {
      return contentID;
    }
    
    public void setContentID(int ContentID){
      this.contentID = ContentID;
    }
    
    
    public int getLevel() {
      return level;
    }
    
    public void setLevel(int Level){
      this.level = Level;
    }
    
    public String getStatus() {
      return status;
    }
    
    public void setStatus(String Status){
      this.status = Status;
    }
    
    public int getIsRejected() {
      return isRejected;
    }
    
    public void setIsRejected(int IsRejected){
      this.isRejected = IsRejected;
    }
    
   

    
}  
  



