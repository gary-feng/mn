/**
 * Use this class support deploy to tomcat
 */
package com.mn.servlet;

import com.mn.MeinvApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MeinvApplication.class);
	}

}
