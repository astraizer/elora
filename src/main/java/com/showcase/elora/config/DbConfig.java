package com.showcase.elora.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class DbConfig {

    @Autowired
    private Environment env;

    @Primary
    @Bean(name = "dbDataSource")
    public DataSource dbDataSource() {
        log.info("env: {} ",env.getProperty("spring.datasource.driver-class-name"));
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(System.getenv("DB_URL") !=null ? System.getenv("DB_URL") : env.getProperty("spring.datasource.url"));
        dataSource.setUsername(System.getenv("DB_USERNAME") != null ? System.getenv("DB_USERNAME") : env.getProperty("spring.datasource.username"));
        dataSource.setPassword(System.getenv("DB_PASSWORD") != null ? System.getenv("DB_PASSWORD") : env.getProperty("spring.datasource.password"));

        return dataSource;
    }
}

