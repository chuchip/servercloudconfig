package com.profesorp.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("otrosdatos")
public class Configuration {
	private int dato1;
	private int dato2;	
	private int dato3; // no esta definida como propiedd pero no pasa nada. Su valor sera 0.
}
