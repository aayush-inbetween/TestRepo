// template will be used to create both Item and Tag type entity-class

package com.cs.im.generated.interactor.operation.entity;

import java.io.Serializable;
import javax.persistence.Entity;



import javax.persistence.CascadeType;
import java.util.Set;

import com.cs.im.core.interactor.operation.entity.base.Tag;

@Entity
public class Campaign extends Tag implements Serializable{

	

	
	private String CampaignName;

	public String getCampaignName () {
		return this.CampaignName;
	}

	public void setCampaignName (String CampaignName){
		this.CampaignName = CampaignName;
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
    String data = "Campaign [ ";
		data += "\nCampaignName : " + CampaignName + "\ntype : " + type + "\ndescription : " + description + "]";
		return data;
  }
}