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
  @created(2014/11/29 22:01:51)
  @cvs($Date: 2014/11/29 22:01:51 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "adsspaces")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AdsspacesModel extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    private String advName; //广告名称
    private String description; //位置说明
    private int isActive; //是否激活
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
  



