package org.sathyatech.raghu.service.impl;

import org.sathyatech.raghu.service.GenericService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdService implements GenericService{

	@Value("${my.env.code}")
	private String code;
	
	@Value("${db.name}")
	private String code1;
	@Value("${app.name}")
	private String code2;
	
	@Override
	public void executeService() {
		System.out.println("CODE IS:"+code+","+code1+","+code2);
		System.out.println("from Production");
	}

	
}
