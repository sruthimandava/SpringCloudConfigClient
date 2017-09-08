package com.tek.springcloudconfigserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope
@RestController
public class MyConfigClient {

	@Value("${message}")
	public String mess;

	@RequestMapping("/message")
	public String getMess() {
		return mess;
	}

}
