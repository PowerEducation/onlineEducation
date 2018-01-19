package com.in.power.education.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.util.ObjectUtils;

@MappedSuperclass
public abstract class AbstractEntity {

	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long autoID;

	/**
	 * @return the autoID
	 */
	public Long getAutoID() {
		return autoID;
	}

	/**
	 * @param autoID the autoID to set
	 */
	public void setAutoID(Long autoID) {
		this.autoID = autoID;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(!(obj instanceof AbstractEntity))
			return false;
		
		AbstractEntity entity = (AbstractEntity) obj;
		
		return ObjectUtils.nullSafeEquals(this.autoID, entity.autoID);
	}
	
}
