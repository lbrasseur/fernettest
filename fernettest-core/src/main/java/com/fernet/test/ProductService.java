package com.fernet.test;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public interface ProductService {
	@POST
	@Path("/queryProduct/{areaCode}/dummy/{productCode}")
	ProductQueryResponseDto queryProduct(
			@PathParam("productCode") Integer productCode,
			@PathParam("areaCode") String areaCode,
			@QueryParam("stock") Double stock,
			ProductQueryRequestDto productQueryDto);
}
