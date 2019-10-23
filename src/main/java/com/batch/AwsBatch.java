package com.batch;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class AwsBatch {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		readProperties();
	}

	public static void readProperties() throws IOException, URISyntaxException {
		
		File file = new File("resources/config.properties");
		String absolutePath = file.getAbsolutePath();
		String canonicalPath = file.getCanonicalPath();
		String path = "/config.properties";
		
		System.out.println("path :"+path);
		System.out.println("absolutePath :"+absolutePath);
		System.out.println("canonicalPath :"+canonicalPath);
		
		Map<String, String> envProperties = System.getenv();
		for(Map.Entry<String, String> prop : envProperties.entrySet()) {
			System.out.println("Environment Properties : "+prop.getKey() + prop.getValue());
		}
		
		System.out.println(System.getenv("application")+" application is deployed on "+System.getenv("environment")+" environment");
		 
//		try (InputStream input = AwsBatch.class.getClassLoader().getResourceAsStream("config.properties")) {
//
//            Properties prop = new Properties();
//
//            if (input == null) {
//                System.out.println("Sorry, unable to find config.properties");
//                return;
//            }
//
//            //load a properties file from class path, inside static method
//            prop.load(input);
//
//            //get the property value and print it out
//            System.err.println(prop.getProperty("environment"));
//            System.err.println(prop.getProperty("application"));
//
//            System.out.println(prop.getProperty("application")+" application is deployed on "+prop.getProperty("environment")+" environment");
//            
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
	}
	
	public String getMessage() {
		return "sushant";
	}
}