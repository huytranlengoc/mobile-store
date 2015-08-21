package org.pearl.mobilepearl.domain.dto;

import org.pearl.mobilepearl.domain.Category;

public class MobileSearchCriteria {

	private String name;
	private Category category;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
