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
  @abstract(DB TableName: contentattas_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/11/29 22:01:53)
  @cvs($Date: 2014/11/29 22:01:53 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "contentattas")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContentattasModel extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    private int priority; //排序
    private String attachmentPath; //附件路径
    private String attachmentName; //附件名称
    private String fileName; //文件名
    private int downloadCount; //下载次数
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    public int getPriority() {
      return priority;
    }
    
    public void setPriority(int Priority){
      this.priority = Priority;
    }
    
    public String getAttachmentPath() {
      return attachmentPath;
    }
    
    public void setAttachmentPath(String AttachmentPath){
      this.attachmentPath = AttachmentPath;
    }
    
    public String getAttachmentName() {
      return attachmentName;
    }
    
    public void setAttachmentName(String AttachmentName){
      this.attachmentName = AttachmentName;
    }
    
    public String getFileName() {
      return fileName;
    }
    
    public void setFileName(String FileName){
      this.fileName = FileName;
    }
    
    public int getDownloadCount() {
      return downloadCount;
    }
    
    public void setDownloadCount(int DownloadCount){
      this.downloadCount = DownloadCount;
    }
    
   

    
}  
  



