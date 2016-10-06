package com.marash.limitlessWorld.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marash.limitlessWorld.dao.MapDAO;
import com.marash.limitlessWorld.data.map.Map;
import com.marash.limitlessWorld.data.map.Tile;
import com.marash.limitlessWorld.data.request.MapRequest;

@Service
public class MapService {
	
	@Autowired
	private MapDAO mapDAO;
	
	public Map getMap(MapRequest mapRequest){
		List<Tile> tilesResult = getMapDAO().getMap(mapRequest);
		
		int totalX = mapRequest.getToX() - mapRequest.getFromX();
		int totalY = mapRequest.getToY() - mapRequest.getFromY();
		
		ArrayList<ArrayList<Tile>> finalResult = new ArrayList<ArrayList<Tile>>(totalY);
		// fill finalResult with array of null Tiles
		for (int i = 0; i < totalY; i++) {
			ArrayList<Tile> row = new ArrayList<Tile>(Collections.nCopies(totalX, null));
			finalResult.add(row);
		}
		
		for (Tile tile : tilesResult){
			ArrayList<Tile> row = finalResult.get(tile.getY()-mapRequest.getFromY());
			row.set(tile.getX()-mapRequest.getFromX(), tile);
		}
		Map map = new Map();
		map.setTiles(finalResult);
		
		return map;
	}

	
	// getter / setter
	public MapDAO getMapDAO() {
		return mapDAO;
	}

	public void setMapDAO(MapDAO mapDAO) {
		this.mapDAO = mapDAO;
	}
}
