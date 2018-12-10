package com.profesorp.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("datosservidor")
public class ConfigurationData {	
	private int minimum;
	private int maximum;
	
}