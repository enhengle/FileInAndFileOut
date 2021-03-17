package com.example.FileInAndFileOut.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
        entityManagerFactoryRef = "businessEntityManagerFactory",
        transactionManagerRef = "businessTransactionManager",
        basePackages = {"com.example.FileInAndFileOut.dao.respository.manager"}
)
public class ManagerConfig {

    @Bean(name = "businessDataSource")
    @ConfigurationProperties(prefix = "manager")
    @Primary
    public DataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "businessEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean statBusinessEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("businessDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource).packages("com.example.FileInAndFileOut.dao.pojo.manager").persistenceUnit("manager")
                .build();
    }

    @Bean(name = "businessTransactionManager")
    @Primary
    public PlatformTransactionManager statBusinessTransactionManager(
            @Qualifier("businessEntityManagerFactory") EntityManagerFactory businessEntityManagerFactory) {
        return new JpaTransactionManager(businessEntityManagerFactory);
    }
}

