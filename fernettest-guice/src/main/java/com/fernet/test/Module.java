package com.fernet.test;

import com.fernet.test.product.ProductService;
import com.fernet.test.product.ProductServiceImpl;
import com.fernet.test.security.SecurityService;
import com.fernet.test.security.SecurityServiceImpl;
import com.google.inject.AbstractModule;

public class Module extends AbstractModule {
	@Override
	protected void configure() {
		bind(SecurityService.class).to(SecurityServiceImpl.class);
		bind(ProductService.class).to(ProductServiceImpl.class);
	}
}
