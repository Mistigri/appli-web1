package com.wha.spring.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("Poduction")
@Configuration
public class ProductionDatabaseConfig implements DatabaseConfig {
	@Bean
	public DataSource createDataSource() {
		System.out.println("Creating Production database");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		return dataSource;
	}
}
