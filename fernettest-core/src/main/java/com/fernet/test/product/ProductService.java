package com.fernet.test.product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public interface ProductService {
	@GET
	@Path("/service/products")
	ProductResponse getProducts();
}