package com.imyueyue.admin.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.imyueyue.common.model.AbstractModel;

/*
  @abstract(DB TableName: channels_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "channels")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ChannelsModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ChannelID", nullable = false)
   
    private int channelID;
    
    
    private int modelID; //模型ID
    
    private int siteID; //网站ID
    
    private int parentID; //父栏目ID
   
    @Pattern(regexp = "[A-Za-z0-9]{5,20}", message = "{username.illegal}")
    private String channelPath; //访问路径
    private int priority; //排列顺序
    private int isContent; //是否有内容
    private int clickCount; //点击次数
    private int isActive; //是否激活
    private String udf1; //自定义1
    private String udf2; //自定义2
    private String udf3; //自定义3
    private String udf4; //自定义4
    private String udf5; //自定义5
    private String udf6; //自定义6
    private String addWho; //创建人
    private Date addTime; //创建日期
    private String editWho; //更新人
    private Date editTime; //更新日期
        
    
    public int getChannelID() {
      return channelID;
    }
    
    public void setChannelID(int ChannelID){
      this.channelID = ChannelID;
    }
    
    
    public int getModelID() {
      return modelID;
    }
    
    public void setModelID(int ModelID){
      this.modelID = ModelID;
    }
    
    
    public int getSiteID() {
      return siteID;
    }
    
    public void setSiteID(int SiteID){
      this.siteID = SiteID;
    }
    
    
    public int getParentID() {
      return parentID;
    }
    
    public void setParentID(int ParentID){
      this.parentID = ParentID;
    }
    
    
    public String getChannelPath() {
      return channelPath;
    }
    
    public void setChannelPath(String ChannelPath){
      this.channelPath = ChannelPath;
    }
    
    public int getPriority() {
      return priority;
    }
    
    public void setPriority(int Priority){
      this.priority = Priority;
    }
    
    public int getIsContent() {
      return isContent;
    }
    
    public void setIsContent(int IsContent){
      this.isContent = IsContent;
    }
    
    public int getClickCount() {
      return clickCount;
    }
    
    public void setClickCount(int ClickCount){
      this.clickCount = ClickCount;
    }
    
    public int getIsActive() {
      return isActive;
    }
    
    public void setIsActive(int IsActive){
      this.isActive = IsActive;
    }
    
    public String getUdf1() {
      return udf1;
    }
    
    public void setUdf1(String Udf1){
      this.udf1 = Udf1;
    }
    
    public String getUdf2() {
      return udf2;
    }
    
    public void setUdf2(String Udf2){
      this.udf2 = Udf2;
    }
    
    public String getUdf3() {
      return udf3;
    }
    
    public void setUdf3(String Udf3){
      this.udf3 = Udf3;
    }
    
    public String getUdf4() {
      return udf4;
    }
    
    public void setUdf4(String Udf4){
      this.udf4 = Udf4;
    }
    
    public String getUdf5() {
      return udf5;
    }
    
    public void setUdf5(String Udf5){
      this.udf5 = Udf5;
    }
    
    public String getUdf6() {
      return udf6;
    }
    
    public void setUdf6(String Udf6){
      this.udf6 = Udf6;
    }
    
    public String getAddWho() {
      return addWho;
    }
    
    public void setAddWho(String AddWho){
      this.addWho = AddWho;
    }
    
    public Date getAddTime() {
      return addTime;
    }
    
    public void setAddTime(Date AddTime){
      this.addTime = AddTime;
    }
    
    public String getEditWho() {
      return editWho;
    }
    
    public void setEditWho(String EditWho){
      this.editWho = EditWho;
    }
    
    public Date getEditTime() {
      return editTime;
    }
    
    public void setEditTime(Date EditTime){
      this.editTime = EditTime;
    }
    
   

    
}  
  



