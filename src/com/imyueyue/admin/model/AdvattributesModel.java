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
  @abstract(DB TableName: advattributes_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:55)
  @cvs($Date: 2014/12/7 23:52:55 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "advattributes")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AdvattributesModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AdvID", nullable = false)
    private int advID;
    
    
    private String attrName; //属性名称
    private String attrValue; //属性值
        
    
    public int getAdvID() {
      return advID;
    }
    
    public void setAdvID(int AdvID){
      this.advID = AdvID;
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
  



