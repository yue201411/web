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
  @abstract(DB TableName: userroles_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 22:01:54)
  @cvs($Date: 2014/11/29 22:01:54 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "userroles")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserrolesModel extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
   

    
}  
  



