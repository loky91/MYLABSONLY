package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.*;
import org.springframework.core.env.*;



@Configuration
@PropertySource(value= {"classpath:common.properties","classpath:mysql.properties"})

public class JlcConfig {

@Autowired
private Environment env;

@Value("${jlc.pw}")
private String password;

@Value("${jlc.max}")
private int max;

@Value("${jlc.min}")
private int min;

@Value("${jlc.timeout}")
private int timeout;


@Bean(name="mysqlDS")
public DataSource mysqlDataSource() {
	DataSource ds=new DataSource();
	ds.setDriverClass(env.getProperty("mysql.dc"));
	ds.setUrl(env.getProperty("mysql.url"));
	ds.setUsername(env.getProperty("mysql.un"));
	ds.setMax(max);
	
	ds.setMin(min);
	ds.setPassword(password);
	ds.setTimeout(timeout);
	return ds;
	
}


@Bean
public TestBean test() {
	
	return new TestBean();
}
	
@Bean
public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
	return new PropertySourcesPlaceholderConfigurer();
	
}


}