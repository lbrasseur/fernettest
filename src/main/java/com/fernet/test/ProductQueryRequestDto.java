package com.fernet.test;

public class ProductQueryRequestDto {
	private final String code;

	public ProductQueryRequestDto(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
