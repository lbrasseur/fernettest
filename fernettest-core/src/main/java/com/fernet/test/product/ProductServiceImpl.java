package com.fernet.test.product;

public class ProductServiceImpl implements ProductService {
	@Override
	public ProductResponse getProducts() {
		ProductResponse response = new ProductResponse();
		response.getResults().add(new Product(123, "Coca cola", 15.5));
		response.getResults().add(new Product(456, "Fernet", 87.30));
		return response;
	}
}
