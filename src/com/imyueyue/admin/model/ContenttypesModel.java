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
  @abstract(DB TableName: contenttypes_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "contenttypes")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContenttypesModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TypeID", nullable = false)
    private int typeID;
    
    
    private String typeName; //类型名称
    
    private String imgSize; //图片大小
    private int isActive; //是否显示
    private String description; //说明
        
    
    public int getTypeID() {
      return typeID;
    }
    
    public void setTypeID(int TypeID){
      this.typeID = TypeID;
    }
    
    
    public String getTypeName() {
      return typeName;
    }
    
    public void setTypeName(String TypeName){
      this.typeName = TypeName;
    }
    
    
    public String getImgSize() {
      return imgSize;
    }
    
    public void setImgSize(String ImgSize){
      this.imgSize = ImgSize;
    }
    
    public int getIsActive() {
      return isActive;
    }
    
    public void setIsActive(int isActive){
      this.isActive = isActive;
    }
    
    public String getDescription() {
      return description;
    }
    
    public void setDescription(String Description){
      this.description = Description;
    }
    
   

    
}  
  



