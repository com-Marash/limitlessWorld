package com.marash.limitlessWorld.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.marash.limitlessWorld.data.map.Tile;
import com.marash.limitlessWorld.data.mapper.TileMapper;
import com.marash.limitlessWorld.data.request.MapRequest;

@Repository
public class MapDAO {
	
	@Autowired
	private NamedParameterJdbcTemplate  namedParameterJdbcTemplate ;
	
	public List<Tile> getMap(MapRequest mapRequest){
		 String sql = "select * from tile where tile.x >= :fromX && tile.x < :toX && tile.y >= :fromY && tile.y < :toY";

		 Map<String, Integer> namedParameters =new HashMap<String,Integer>(){{
			 put("fromX", mapRequest.getFromX());
			 put("toX", mapRequest.getToX());
			 put("fromY", mapRequest.getFromY());
			 put("toY", mapRequest.getToY());
		 }};
		    
		List<Tile> tiles = (List<Tile>) getNamedParameterJdbcTemplate().query(sql, namedParameters, new TileMapper());
		return tiles;
	}

	
	// getter / setters
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}


	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
}
