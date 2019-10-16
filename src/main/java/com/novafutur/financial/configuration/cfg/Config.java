package com.novafutur.financial.configuration.cfg;

import org.apache.commons.dbcp2.BasicDataSource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Autowired
    private Environment env;

    @Bean(destroyMethod = "")
    public DataSource configurationManagerDS() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(env.getRequiredProperty("spring.datasource.url"));
        dataSource.setUsername(env.getRequiredProperty("spring.datasource.username"));
        dataSource.setPassword(env.getRequiredProperty("spring.datasource.password"));
        dataSource.setInitialSize(1);
        dataSource.setMaxTotal(10);
        return dataSource;
    }

    @Bean
    public DSLContext dslContext(){
        Settings settings = new Settings();
        settings.setRenderSchema(false);
        return DSL.using(configurationManagerDS() , SQLDialect.MYSQL, settings);
    }



}
