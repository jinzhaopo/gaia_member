package com.gaia.member.model;

import javax.persistence.Table;

import com.nt.framework.model.BaseEntity;

@Table(name = "nt_test")
public class Test extends BaseEntity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
