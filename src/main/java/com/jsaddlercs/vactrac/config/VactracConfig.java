package com.jsaddlercs.vactrac.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@Configuration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class VactracConfig {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
//	@Bean
//	public DataSource dataSource() {
//		logger.debug("Creating the datasource bean explicitly");
//
//		return
//				(new EmbeddedDatabaseBuilder())
//						.addScript("classpath:/schema.sql")
//						.addScript("classpath:/data.sql")
//						.build();
//	}
}
