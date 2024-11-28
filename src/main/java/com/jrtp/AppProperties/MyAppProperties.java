package com.jrtp.AppProperties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class MyAppProperties {
   Map<String,String>props=new HashMap<>();

public Map<String, String> getProps() {
	return props;
}

public void setProps(Map<String, String> props) {
	this.props = props;
}
   
}
