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
  @created(2014/11/29 22:01:53)
  @cvs($Date: 2014/11/29 22:01:53 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "contenttags")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContenttagsModel extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    private int refCount; //使用次数
    private String description; //说明
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
  



