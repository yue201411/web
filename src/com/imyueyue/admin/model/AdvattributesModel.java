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
  @created(2014/11/29 22:01:53)
  @cvs($Date: 2014/11/29 22:01:53 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "advattributes")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AdvattributesModel extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    private String attrName; //属性名称
    private String attrValue; //属性值
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
  



