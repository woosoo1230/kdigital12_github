package edu.spring.mybatis;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override //톰캣(서버) 설정할테니까 실행하라고 알려줘라
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Kdigital12StsApplication.class);
	}

}
