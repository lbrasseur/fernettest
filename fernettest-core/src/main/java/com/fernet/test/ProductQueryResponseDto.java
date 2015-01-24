package com.fernet.test;

public class ProductQueryResponseDto {
	private String name;
	private String code;
	private Double stock;

	public ProductQueryResponseDto(String name, String code, Double stock) {
		this.name = name;
		this.code = code;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public Double getStock() {
		return stock;
	}
}
