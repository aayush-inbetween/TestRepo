// template will be used to create both Item and Tag type entity-class

package com.cs.im.generated.interactor.operation.entity;

import java.io.Serializable;
import javax.persistence.Entity;



import javax.persistence.CascadeType;
import java.util.Set;

import com.cs.im.core.interactor.operation.entity.base.Item;

@Entity
public class Promotion extends Item implements Serializable{

	

	
	private String PromotionName;

	public String getPromotionName () {
		return this.PromotionName;
	}

	public void setPromotionName (String PromotionName){
		this.PromotionName = PromotionName;
	}

	
	private String type;

	public String getType () {
		return this.type;
	}

	public void setType (String type){
		this.type = type;
	}

	
	private String description;

	public String getDescription () {
		return this.description;
	}

	public void setDescription (String description){
		this.description = description;
	}

  @Override
  public String toString(){
    String data = "Promotion [ ";
		data += "\nPromotionName : " + PromotionName + "\ntype : " + type + "\ndescription : " + description + "]";
		return data;
  }
}