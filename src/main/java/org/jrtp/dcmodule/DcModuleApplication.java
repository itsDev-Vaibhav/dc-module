package org.jrtp.dcmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DcModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcModuleApplication.class, args);
	}

}
