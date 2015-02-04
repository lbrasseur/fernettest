package com.fernet.test.security;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.fernet.test.StatusDto;

public interface SecurityService {
	@POST
	@Path("/service/login")
	StatusDto login(LoginDto dto);

	@GET
	@Path("/service/logout")
	StatusDto logout();

}