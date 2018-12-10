package com.chuchip.capitalessm.paisesconfigservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties("datosservidor")
public class ConfigurationData {	
	private int maxResultados;
	private int minResultados;
	
}