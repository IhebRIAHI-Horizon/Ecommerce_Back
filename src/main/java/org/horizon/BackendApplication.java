package org.horizon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BackendApplication extends SpringBootServletInitializer {

	private static final Logger LOGGER = LogManager.getLogger(BackendApplication.class);
	
	public static void main(String[] args)  {
		SpringApplication.run(BackendApplication.class, args);
		
		LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
	}

}
