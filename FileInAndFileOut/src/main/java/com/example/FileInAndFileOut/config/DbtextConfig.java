package com.example.FileInAndFileOut.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @author lingwang
 * @date 2021/3/16 20:40
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "campEntityManagerFactory",
        transactionManagerRef = "campTransactionManager",
        basePackages = {"com.example.FileInAndFileOut.dao.respository.dbtext"})

public class DbtextConfig {

    @Bean(name = "campDataSource")
    @ConfigurationProperties(prefix = "dbtext")
    public DataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }


    @Bean(name = "campEntityManagerFactory" )
    public LocalContainerEntityManagerFactoryBean campEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("campDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource).packages("com.example.FileInAndFileOut.dao.pojo.dbtext").persistenceUnit("camp")
                .build();
    }

    @Bean(name = "campTransactionManager")
    public PlatformTransactionManager campTransactionManager(
            @Qualifier("campEntityManagerFactory") EntityManagerFactory campEntityManagerFactory) {
        return new JpaTransactionManager(campEntityManagerFactory);
    }
}