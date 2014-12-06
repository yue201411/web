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
  @abstract(DB TableName: contentexts_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 22:01:53)
  @cvs($Date: 2014/11/29 22:01:53 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "contentexts")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContentextsModel extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    private String title; //标题
    private String shortTitle; //短标题
    private String author; //作者
    private String origin; //来源
    private String originUrl; //来源路径
    private String desctiption; //说明
    private String mediaImg; //媒体路径
    private String mediaType; //媒体类型
    private String titleImg; //简略图
    private String contentImg; //内容简略图
    private String link; //外链接
    private String tplContent; //模板
    private String isRegeneRate; //是否重新生成
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
    
    public String getTitle() {
      return title;
    }
    
    public void setTitle(String Title){
      this.title = Title;
    }
    
    public String getShortTitle() {
      return shortTitle;
    }
    
    public void setShortTitle(String ShortTitle){
      this.shortTitle = ShortTitle;
    }
    
    public String getAuthor() {
      return author;
    }
    
    public void setAuthor(String Author){
      this.author = Author;
    }
    
    public String getOrigin() {
      return origin;
    }
    
    public void setOrigin(String Origin){
      this.origin = Origin;
    }
    
    public String getOriginUrl() {
      return originUrl;
    }
    
    public void setOriginUrl(String OriginUrl){
      this.originUrl = OriginUrl;
    }
    
    public String getDesctiption() {
      return desctiption;
    }
    
    public void setDesctiption(String Desctiption){
      this.desctiption = Desctiption;
    }
    
    public String getMediaImg() {
      return mediaImg;
    }
    
    public void setMediaImg(String MediaImg){
      this.mediaImg = MediaImg;
    }
    
    public String getMediaType() {
      return mediaType;
    }
    
    public void setMediaType(String MediaType){
      this.mediaType = MediaType;
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
    
    public String getLink() {
      return link;
    }
    
    public void setLink(String Link){
      this.link = Link;
    }
    
    public String getTplContent() {
      return tplContent;
    }
    
    public void setTplContent(String TplContent){
      this.tplContent = TplContent;
    }
    
    public String getIsRegeneRate() {
      return isRegeneRate;
    }
    
    public void setIsRegeneRate(String IsRegeneRate){
      this.isRegeneRate = IsRegeneRate;
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
  



