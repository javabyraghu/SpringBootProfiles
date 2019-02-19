package org.sathyatech.raghu.runner;

import org.sathyatech.raghu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner{
	
	@Autowired
	private GenericService service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("---from Runner code---");
		service.executeService();
	}

}
