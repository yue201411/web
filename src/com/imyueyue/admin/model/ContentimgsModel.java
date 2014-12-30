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
  @abstract(DB TableName: contentimgs_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "contentimgs")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContentimgsModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ContentID", nullable = false)
    private int contentID;
    
    
    private int priority; //排列顺序
    private String imgPath; //图片路径
    private String description; //说明
        
    
    public int getContentID() {
      return contentID;
    }
    
    public void setContentID(int ContentID){
      this.contentID = ContentID;
    }
    
    
    public int getPriority() {
      return priority;
    }
    
    public void setPriority(int Priority){
      this.priority = Priority;
    }
    
    public String getImgPath() {
      return imgPath;
    }
    
    public void setImgPath(String ImgPath){
      this.imgPath = ImgPath;
    }
    
    public String getDescription() {
      return description;
    }
    
    public void setDescription(String Description){
      this.description = Description;
    }
    
   

    
}  
  



