package com.fernet.test;

public class ProductServiceImpl implements ProductService {
	public ProductQueryResponseDto queryProduct(Integer productCode,
			String areaCode, Double stock,
			ProductQueryRequestDto productQueryDto) {
		return new ProductQueryResponseDto(productQueryDto.getName(), areaCode
				+ "-" + productCode, stock);
	}
}
