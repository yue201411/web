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
  @abstract(DB TableName: configs_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 22:01:53)
  @cvs($Date: 2014/11/29 22:01:53 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "configs")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ConfigsModel extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    private String contentPath; //部署路径
    private String dbLink; //数据库访问地址
    private int isUploadToDb; //是否上传附件至数据库
    private String defImage; //默认显示图片
    private String loginPath; //登录地址
    private int isMark; //是否图片水印
    private String markImgSize; //图片大小
    private String markImg; //水印图片
    private String markContent; //水印内容
    private int markFontSize; //水印文字大小
    private int markPostion; //水印位置
    private int markAlpha; //水印透明度
    private Date clearTime; //计数器清除时间
    private String emailHost; //邮件发送服务器
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
    
    public String getContentPath() {
      return contentPath;
    }
    
    public void setContentPath(String ContentPath){
      this.contentPath = ContentPath;
    }
    
    public String getDbLink() {
      return dbLink;
    }
    
    public void setDbLink(String DbLink){
      this.dbLink = DbLink;
    }
    
    public int getIsUploadToDb() {
      return isUploadToDb;
    }
    
    public void setIsUploadToDb(int IsUploadToDb){
      this.isUploadToDb = IsUploadToDb;
    }
    
    public String getDefImage() {
      return defImage;
    }
    
    public void setDefImage(String DefImage){
      this.defImage = DefImage;
    }
    
    public String getLoginPath() {
      return loginPath;
    }
    
    public void setLoginPath(String LoginPath){
      this.loginPath = LoginPath;
    }
    
    public int getIsMark() {
      return isMark;
    }
    
    public void setIsMark(int IsMark){
      this.isMark = IsMark;
    }
    
    public String getMarkImgSize() {
      return markImgSize;
    }
    
    public void setMarkImgSize(String MarkImgSize){
      this.markImgSize = MarkImgSize;
    }
    
    public String getMarkImg() {
      return markImg;
    }
    
    public void setMarkImg(String MarkImg){
      this.markImg = MarkImg;
    }
    
    public String getMarkContent() {
      return markContent;
    }
    
    public void setMarkContent(String MarkContent){
      this.markContent = MarkContent;
    }
    
    public int getMarkFontSize() {
      return markFontSize;
    }
    
    public void setMarkFontSize(int MarkFontSize){
      this.markFontSize = MarkFontSize;
    }
    
    public int getMarkPostion() {
      return markPostion;
    }
    
    public void setMarkPostion(int MarkPostion){
      this.markPostion = MarkPostion;
    }
    
    public int getMarkAlpha() {
      return markAlpha;
    }
    
    public void setMarkAlpha(int MarkAlpha){
      this.markAlpha = MarkAlpha;
    }
    
    public Date getClearTime() {
      return clearTime;
    }
    
    public void setClearTime(Date ClearTime){
      this.clearTime = ClearTime;
    }
    
    public String getEmailHost() {
      return emailHost;
    }
    
    public void setEmailHost(String EmailHost){
      this.emailHost = EmailHost;
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
  



