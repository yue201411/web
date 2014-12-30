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
  @abstract(DB TableName: sites_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "sites")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SitesModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SiteID", nullable = false)
    private int siteID;
    
    
    private int configID; //设置ID
    private String domain; //域名
    private String sitePath; //站点地址
    private String siteName; //站点名称
    private String shortName; //简称
    private String protocol; //协议
    private String dynamicSuffix; //动态页后缀
    private String staticSuffix; //静态页后缀
    private String staticPath; //静态地址
    private String tplSolution; //模板方案
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
        
    
    public int getSiteID() {
      return siteID;
    }
    
    public void setSiteID(int SiteID){
      this.siteID = SiteID;
    }
    
    
    public int getConfigID() {
      return configID;
    }
    
    public void setConfigID(int ConfigID){
      this.configID = ConfigID;
    }
    
    public String getDomain() {
      return domain;
    }
    
    public void setDomain(String Domain){
      this.domain = Domain;
    }
    
    public String getSitePath() {
      return sitePath;
    }
    
    public void setSitePath(String SitePath){
      this.sitePath = SitePath;
    }
    
    public String getSiteName() {
      return siteName;
    }
    
    public void setSiteName(String SiteName){
      this.siteName = SiteName;
    }
    
    public String getShortName() {
      return shortName;
    }
    
    public void setShortName(String ShortName){
      this.shortName = ShortName;
    }
    
    public String getProtocol() {
      return protocol;
    }
    
    public void setProtocol(String Protocol){
      this.protocol = Protocol;
    }
    
    public String getDynamicSuffix() {
      return dynamicSuffix;
    }
    
    public void setDynamicSuffix(String DynamicSuffix){
      this.dynamicSuffix = DynamicSuffix;
    }
    
    public String getStaticSuffix() {
      return staticSuffix;
    }
    
    public void setStaticSuffix(String StaticSuffix){
      this.staticSuffix = StaticSuffix;
    }
    
    public String getStaticPath() {
      return staticPath;
    }
    
    public void setStaticPath(String StaticPath){
      this.staticPath = StaticPath;
    }
    
    public String getTplSolution() {
      return tplSolution;
    }
    
    public void setTplSolution(String TplSolution){
      this.tplSolution = TplSolution;
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
  



