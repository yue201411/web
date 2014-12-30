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
  @abstract(DB TableName: contenttags_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "contenttags")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContenttagsModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TagID", nullable = false)
    private int tagID;
    
    
    private String tagName; //名称
    
    private int refCount; //使用次数
    private String description; //说明
        
    
    public int getTagID() {
      return tagID;
    }
    
    public void setTagID(int TagID){
      this.tagID = TagID;
    }
    
    
    public String getTagName() {
      return tagName;
    }
    
    public void setTagName(String TagName){
      this.tagName = TagName;
    }
    
    
    public int getRefCount() {
      return refCount;
    }
    
    public void setRefCount(int RefCount){
      this.refCount = RefCount;
    }
    
    public String getDescription() {
      return description;
    }
    
    public void setDescription(String Description){
      this.description = Description;
    }
    
   

    
}  
  



