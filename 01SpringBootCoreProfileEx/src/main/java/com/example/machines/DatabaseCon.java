package com.example.machines;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.app")
public class DatabaseCon 
{
	private String driver;
	private String url;
	private String user;
	private String pass;
}
