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
  @abstract(DB TableName: channelcnts_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 22:01:53)
  @cvs($Date: 2014/11/29 22:01:53 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "channelcnts")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ChannelcntsModel extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    private String channelName; //栏目名称
    private int level; //审核级别
    private int isstatic; //栏目静态化
    private String isstaticContent; //内容静态化
    private int isAccessDir; //目录访问
    private int isContent; //是否有内容
    private int isChild; //子栏目列表
    private int pageSize; //每页显示记录
    private String cannelRule; //栏目生成规则
    private String contentRule; //内容生成规则
    private String link; //外部链接
    private String tplChannel; //栏目页模板
    private String tplContent; //内容页模板
    private String titleImg; //缩略图
    private String contentImg; //内容图
    private String titleImgWidth; //缩略图大小
    private String contentImgWidth; //内容图大小
    private int isBlank; //是否新窗口打开
    private String title; //标题
    private String keywords; //关键字
    private String description; //说明
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
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    public String getChannelName() {
      return channelName;
    }
    
    public void setChannelName(String ChannelName){
      this.channelName = ChannelName;
    }
    
    public int getLevel() {
      return level;
    }
    
    public void setLevel(int Level){
      this.level = Level;
    }
    
    public int getIsstatic() {
      return isstatic;
    }
    
    public void setIsstatic(int Isstatic){
      this.isstatic = Isstatic;
    }
    
    public String getIsstaticContent() {
      return isstaticContent;
    }
    
    public void setIsstaticContent(String IsstaticContent){
      this.isstaticContent = IsstaticContent;
    }
    
    public int getIsAccessDir() {
      return isAccessDir;
    }
    
    public void setIsAccessDir(int IsAccessDir){
      this.isAccessDir = IsAccessDir;
    }
    
    public int getIsContent() {
      return isContent;
    }
    
    public void setIsContent(int IsContent){
      this.isContent = IsContent;
    }
    
    public int getIsChild() {
      return isChild;
    }
    
    public void setIsChild(int IsChild){
      this.isChild = IsChild;
    }
    
    public int getPageSize() {
      return pageSize;
    }
    
    public void setPageSize(int PageSize){
      this.pageSize = PageSize;
    }
    
    public String getCannelRule() {
      return cannelRule;
    }
    
    public void setCannelRule(String CannelRule){
      this.cannelRule = CannelRule;
    }
    
    public String getContentRule() {
      return contentRule;
    }
    
    public void setContentRule(String ContentRule){
      this.contentRule = ContentRule;
    }
    
    public String getLink() {
      return link;
    }
    
    public void setLink(String Link){
      this.link = Link;
    }
    
    public String getTplChannel() {
      return tplChannel;
    }
    
    public void setTplChannel(String TplChannel){
      this.tplChannel = TplChannel;
    }
    
    public String getTplContent() {
      return tplContent;
    }
    
    public void setTplContent(String TplContent){
      this.tplContent = TplContent;
    }
    
    public String getTitleImg() {
      return titleImg;
    }
    
    public void setTitleImg(String TitleImg){
      this.titleImg = TitleImg;
    }
    
    public String getContentImg() {
      return contentImg;
    }
    
    public void setContentImg(String ContentImg){
      this.contentImg = ContentImg;
    }
    
    public String getTitleImgWidth() {
      return titleImgWidth;
    }
    
    public void setTitleImgWidth(String TitleImgWidth){
      this.titleImgWidth = TitleImgWidth;
    }
    
    public String getContentImgWidth() {
      return contentImgWidth;
    }
    
    public void setContentImgWidth(String ContentImgWidth){
      this.contentImgWidth = ContentImgWidth;
    }
    
    public int getIsBlank() {
      return isBlank;
    }
    
    public void setIsBlank(int IsBlank){
      this.isBlank = IsBlank;
    }
    
    public String getTitle() {
      return title;
    }
    
    public void setTitle(String Title){
      this.title = Title;
    }
    
    public String getKeywords() {
      return keywords;
    }
    
    public void setKeywords(String Keywords){
      this.keywords = Keywords;
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
  



