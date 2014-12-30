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
  @abstract(DB TableName: contentattrs_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "contentattrs")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContentattrsModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ContentID", nullable = false)
    private int contentID;
    
    
    private String attrName; //属性名称
    private String attrValue; //属性值
        
    
    public int getContentID() {
      return contentID;
    }
    
    public void setContentID(int ContentID){
      this.contentID = ContentID;
    }
    
    
    public String getAttrName() {
      return attrName;
    }
    
    public void setAttrName(String AttrName){
      this.attrName = AttrName;
    }
    
    public String getAttrValue() {
      return attrValue;
    }
    
    public void setAttrValue(String AttrValue){
      this.attrValue = AttrValue;
    }
    
   

    
}  
  



