package com.cmr.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cmr.springboot.demo.pojo.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import com.owlike.genson.reflect.PropertyNameResolver.ConventionalBeanPropertyNameResolver;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			Customer ob = new Customer();
			ob.setCustomerId("1");
			ob.setCUSTOMER_NAME("anme");
			ob.setCUSTOMERADDR("ADDRSESS");
			
			Genson genson = new GensonBuilder().setHtmlSafe(true).useFields(true).with(new ConventionalBeanPropertyNameResolver()).useIndentation(true).useRuntimeType(true).useDateAsTimestamp(true).setSkipNull(true).create();	
			String json = genson.serialize(ob);
System.out.println("Genson==>"+json);
			Gson gson = new GsonBuilder()
	                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
	                .create();
			System.out.println(gson.toJson(ob));
			
			System.out.println(mapper.writeValueAsString(ob));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
