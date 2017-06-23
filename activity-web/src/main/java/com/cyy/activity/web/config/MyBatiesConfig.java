package com.cyy.activity.web.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class MyBatiesConfig {
	
	@Bean    
	public DataSource createDataSource() throws SQLException {
		
        return DataSourceBuilder.create(Thread.currentThread().getContextClassLoader())
                                      .driverClassName("com.mysql.cj.jdbc.Driver")                
                                      .url("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=false")                
                                      .username("root")             
                                      .password("123")
                                      .build();
    }
	
	
	@Bean
	@ConditionalOnMissingBean
	public SqlSessionFactory sqlSessionfactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		return sqlSessionFactoryBean.getObject();
	}
	
	

}
