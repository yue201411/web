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
  @abstract(DB TableName: contenttopic_MODEL)
  @author(azhai <azhai2014@sina.com>)
  @created(2014/12/7 23:52:56)
  @cvs($Date: 2014/12/7 23:52:56 $)
*/ 
  
@SuppressWarnings("serial")
@Entity
@Table(name = "contenttopic")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContenttopicModel extends AbstractModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ContentID", nullable = false)
    private int contentID;
    
    
    private int topicID; //TOPICID
    
        
    
    public int getContentID() {
      return contentID;
    }
    
    public void setContentID(int ContentID){
      this.contentID = ContentID;
    }
    
    
    public int getTopicID() {
      return topicID;
    }
    
    public void setTopicID(int TopicID){
      this.topicID = TopicID;
    }
    
    
   

    
}  
  



