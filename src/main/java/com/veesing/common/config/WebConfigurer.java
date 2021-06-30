package com.veesing.common.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Component
class WebConfigurer implements WebMvcConfigurer {

	VeesingConfig veesingConfig;

	public WebConfigurer(VeesingConfig veesingConfig) {
		this.veesingConfig = veesingConfig;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/files/**").addResourceLocations("file:///" + veesingConfig.getUploadPath());
	}

}
