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
  @abstract(DB TableName: models_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "models")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ModelsModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ModeID", nullable = false)
    private int modeID;
    
    
    private String modelName; //模块名称
    
    private String modelPath; //模块路径
    private String channelPrefix; //栏目模板前缀
    private String contentPrefix; //内容模板前缀
    private String titleImgSize; //标题图片大小
    private String contentImgSize; //内容图片大小
    private int priority; //排序
    private int isActive; //是否显示
    private String description; //说明
        
    
    public int getModeID() {
      return modeID;
    }
    
    public void setModeID(int ModeID){
      this.modeID = ModeID;
    }
    
    
    public String getModelName() {
      return modelName;
    }
    
    public void setModelName(String ModelName){
      this.modelName = ModelName;
    }
    
    
    public String getModelPath() {
      return modelPath;
    }
    
    public void setModelPath(String ModelPath){
      this.modelPath = ModelPath;
    }
    
    public String getChannelPrefix() {
      return channelPrefix;
    }
    
    public void setChannelPrefix(String ChannelPrefix){
      this.channelPrefix = ChannelPrefix;
    }
    
    public String getContentPrefix() {
      return contentPrefix;
    }
    
    public void setContentPrefix(String ContentPrefix){
      this.contentPrefix = ContentPrefix;
    }
    
    public String getTitleImgSize() {
      return titleImgSize;
    }
    
    public void setTitleImgSize(String TitleImgSize){
      this.titleImgSize = TitleImgSize;
    }
    
    public String getContentImgSize() {
      return contentImgSize;
    }
    
    public void setContentImgSize(String ContentImgSize){
      this.contentImgSize = ContentImgSize;
    }
    
    public int getPriority() {
      return priority;
    }
    
    public void setPriority(int Priority){
      this.priority = Priority;
    }
    
    public int getIsActive() {
      return isActive;
    }
    
    public void setIsActive(int IsActive){
      this.isActive = IsActive;
    }
    
    public String getDescription() {
      return description;
    }
    
    public void setDescription(String Description){
      this.description = Description;
    }
    
   

    
}  
  



