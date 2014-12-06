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
  @abstract(DB TableName: advertisings_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 22:01:53)
  @cvs($Date: 2014/11/29 22:01:53 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "advertisings")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AdvertisingsModel extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    private String advName; //广告名称
    private String category; //广告类型
    private String advCode; //广告代码
    private int advWeight; //广告权重
    private int displayCount; //展示次数
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
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    public String getAdvName() {
      return advName;
    }
    
    public void setAdvName(String AdvName){
      this.advName = AdvName;
    }
    
    public String getCategory() {
      return category;
    }
    
    public void setCategory(String Category){
      this.category = Category;
    }
    
    public String getAdvCode() {
      return advCode;
    }
    
    public void setAdvCode(String AdvCode){
      this.advCode = AdvCode;
    }
    
    public int getAdvWeight() {
      return advWeight;
    }
    
    public void setAdvWeight(int AdvWeight){
      this.advWeight = AdvWeight;
    }
    
    public int getDisplayCount() {
      return displayCount;
    }
    
    public void setDisplayCount(int DisplayCount){
      this.displayCount = DisplayCount;
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
  



