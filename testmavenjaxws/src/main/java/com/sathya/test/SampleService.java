package com.sathya.test;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.soap.Addressing;

@WebService
@SOAPBinding(style=Style.RPC)
public class SampleService {
	
	@WebMethod
	@Addressing(enabled=true, required=true)
	public String sayHello(String name) {
		return String.format("Hello, %s", name);
	}
	
	
	@WebMethod
	@Addressing(enabled=true, required=true)
	public String sayHello(String name,String salute) {
		return "Hello " + salute + " " + name;
	}
	
	@WebMethod
	public ArrayList<Hello> sayComplexHello(String name) {
		ArrayList<Hello> helloList = new ArrayList<Hello>();
		for(int i=0;i<5;i++) {
			Hello h = new Hello(i,name);			
			helloList.add(h);
		}
		return helloList;
	}
}
