package com.fernet.test;

import com.fernet.guice.RestServletModule;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class ContextListener extends GuiceServletContextListener {
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(
				new RestServletModule(ProductService.class),
				new AbstractModule() {
					@Override
					protected void configure() {
						bind(ProductService.class).to(ProductServiceImpl.class);
					}
				});
	}
}
