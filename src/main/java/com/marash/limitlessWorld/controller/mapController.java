package com.marash.limitlessWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marash.limitlessWorld.data.response.mapResponse;

@RestController
public class mapController {

	@RequestMapping(value = "/getMap" , method = RequestMethod.POST)
    public mapResponse getMap() {
        
		mapResponse abc = new mapResponse();
		abc.setA("hello");
		
    	return abc;
    }
	
	@RequestMapping(value = "/getMap" , method = RequestMethod.GET)
    public mapResponse getMapGET() {
        
		mapResponse abc = new mapResponse();
		abc.setA("hello");
		
    	return abc;
    }
}
