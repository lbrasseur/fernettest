package com.fernet.test;

public class ProductQueryResponseDto {
	private String name;
	private String code;

	public ProductQueryResponseDto(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}
}
