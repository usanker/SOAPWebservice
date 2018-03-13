package com.globalweather.client;

import NET.webserviceX.www.GlobalWeatherLocator;
import NET.webserviceX.www.GlobalWeatherSoap;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class GlobalWeatherClient {
	
	public static void main(String[] args){
	GlobalWeatherLocator globalweatherLocator=new GlobalWeatherLocator();
	try{
	GlobalWeatherSoap globalweatherSoap=globalweatherLocator.getGlobalWeatherSoap();
	//String weather =globalweatherSoap.getWeather("Dallas", "USA");
	//System.out.println("Weather=>"+weather);
	String Country="INDIA";
	String city=globalweatherSoap.getCitiesByCountry(Country);
	System.out.println("getCitiesByCountry-"+Country+"=>"+city);
	}
	catch(ServiceException | RemoteException se){
		se.printStackTrace();
	}
 }

}
