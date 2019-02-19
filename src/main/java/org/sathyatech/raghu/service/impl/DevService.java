package org.sathyatech.raghu.service.impl;

import org.sathyatech.raghu.service.GenericService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DevService implements GenericService {
	
	@Value("${my.env.code}")
	private String code;
	
	@Override
	public void executeService() {
		System.out.println("CODE IS:"+code);
		System.out.println("FROM DEV(default) SERVICE");
	}

}
