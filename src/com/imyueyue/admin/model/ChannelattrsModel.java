﻿package com.imyueyue.admin.model;

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
  @abstract(DB TableName: channelattrs_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:55)
  @cvs($Date: 2014/12/7 23:52:55 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "channelattrs")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ChannelattrsModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ChannelID", nullable = false)
    private int channelID;
    
    
    private String attrName; //属性名称
    private String attrValue; //属性值
        
    
    public int getChannelID() {
      return channelID;
    }
    
    public void setChannelID(int ChannelID){
      this.channelID = ChannelID;
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
  



