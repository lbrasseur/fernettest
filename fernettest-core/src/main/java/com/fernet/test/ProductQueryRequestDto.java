package com.fernet.test;

public class ProductQueryRequestDto {
	private final String name;

	public ProductQueryRequestDto(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
