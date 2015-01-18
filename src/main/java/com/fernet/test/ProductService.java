package com.fernet.test;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

public class ProductService {
	@POST
	@Path("/queryProduct/{param1}/dummy/{param2}")
	public ProductQueryResponseDto queryProduct(
			ProductQueryRequestDto productQueryDto) {
		return new ProductQueryResponseDto("Fernet Branca",
				productQueryDto.getCode());
	}
}
