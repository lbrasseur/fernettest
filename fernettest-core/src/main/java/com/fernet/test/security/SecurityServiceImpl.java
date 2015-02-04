package com.fernet.test.security;

import com.fernet.test.StatusDto;

public class SecurityServiceImpl implements SecurityService {

//	@RequestMapping(value = "/service/login", method=RequestMethod.POST)
//	@ResponseBody
	@Override
	public StatusDto login(LoginDto dto) {
		boolean isValid = (dto.getUsername().equals("bart")
				&& dto.getPassword().equals("simpson"));

		return new StatusDto(isValid);
	}

//	@RequestMapping(value = "/service/logout", method=RequestMethod.GET)
//	@ResponseBody
	@Override
	public StatusDto logout() {
		return new StatusDto(true);
	}
}
