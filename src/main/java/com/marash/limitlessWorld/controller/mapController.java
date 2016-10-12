package com.marash.limitlessWorld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marash.limitlessWorld.data.map.Map;
import com.marash.limitlessWorld.data.request.MapRequest;
import com.marash.limitlessWorld.data.response.MapResponse;
import com.marash.limitlessWorld.service.MapService;

@RestController
public class mapController {

	@Autowired
	private MapService mapService;
	
	
	@RequestMapping(value = "/getMap" , method = RequestMethod.POST, consumes=  MediaType.APPLICATION_JSON_VALUE )
    public MapResponse getMap(@RequestBody MapRequest mapRequest ) {
		
		Map requestedMap = mapService.getMap(mapRequest); 
		
		// TODO: create Converter for Map to MapResponse
		MapResponse result = new MapResponse();
		result.setMap(requestedMap);
    	return result;
    }

	// getter / setters
	public MapService getMapService() {
		return mapService;
	}

	public void setMapService(MapService mapService) {
		this.mapService = mapService;
	}
}
