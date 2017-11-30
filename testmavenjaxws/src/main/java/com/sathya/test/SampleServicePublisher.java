package com.sathya.test;

import javax.xml.ws.Endpoint;

public class SampleServicePublisher {
	
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/SampleService", new SampleService());
	}

}
