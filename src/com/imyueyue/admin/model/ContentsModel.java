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
  @abstract(DB TableName: contents_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "contents")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContentsModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ContentID", nullable = false)
    private int contentID;
    
    
    private int channelID; //栏目iD
    
    private int userID; //用户ID
    
    private int typeID; //类型ID
    
    private Date sortDate; //排序日期
    private int topLevel; //置顶级别
    private int isRecommend; //是否推荐
    private int status; //状态
    private int viewCount; //日访问次数
    private String udf1; //自定义1
    private String udfF2; //自定义2
    private String udf3; //自定义3
    private String udf4; //自定义4
    private String udf5; //自定义5
    private String udf6; //自定义6
    private String addWho; //创建人
    private Date addTime; //创建日期
    private String editWho; //更新人
    private Date editTime; //更新日期
        
    
    public int getContentID() {
      return contentID;
    }
    
    public void setContentID(int ContentID){
      this.contentID = ContentID;
    }
    
    
    public int getChannelID() {
      return channelID;
    }
    
    public void setChannelID(int ChannelID){
      this.channelID = ChannelID;
    }
    
    
    public int getUserID() {
      return userID;
    }
    
    public void setUserID(int UserID){
      this.userID = UserID;
    }
    
    
    public int getTypeID() {
      return typeID;
    }
    
    public void setTypeID(int TypeID){
      this.typeID = TypeID;
    }
    
    
    public Date getSortDate() {
      return sortDate;
    }
    
    public void setSortDate(Date SortDate){
      this.sortDate = SortDate;
    }
    
    public int getTopLevel() {
      return topLevel;
    }
    
    public void setTopLevel(int TopLevel){
      this.topLevel = TopLevel;
    }
    
    public int getIsRecommend() {
      return isRecommend;
    }
    
    public void setIsRecommend(int IsRecommend){
      this.isRecommend = IsRecommend;
    }
    
    public int getStatus() {
      return status;
    }
    
    public void setStatus(int Status){
      this.status = Status;
    }
    
    public int getViewCount() {
      return viewCount;
    }
    
    public void setViewCount(int ViewCount){
      this.viewCount = ViewCount;
    }
    
    public String getUdf1() {
      return udf1;
    }
    
    public void setUdf1(String Udf1){
      this.udf1 = Udf1;
    }
    
    public String getUdfF2() {
      return udfF2;
    }
    
    public void setUdfF2(String UdfF2){
      this.udfF2 = UdfF2;
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
  



