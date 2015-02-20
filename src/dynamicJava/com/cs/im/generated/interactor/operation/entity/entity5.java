// template will be used to create both Item and Tag type entity-class

package com.cs.im.generated.interactor.operation.entity;

import java.io.Serializable;
import javax.persistence.Entity;



import javax.persistence.CascadeType;
import java.util.Set;

import com.cs.im.core.interactor.operation.entity.base.Item;

@Entity
public class entity5 extends Item implements Serializable{

	

  @Override
  public String toString(){
    String data = "entity5 [ ";
		data += "]";
		return data;
  }
}