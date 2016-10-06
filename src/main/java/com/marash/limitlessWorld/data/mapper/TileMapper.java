package com.marash.limitlessWorld.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.marash.limitlessWorld.data.map.Tile;

public class TileMapper implements RowMapper<Tile>{

	@Override
	public Tile mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tile tile = new Tile();
		tile.setType(rs.getString("type"));
		tile.setX(rs.getInt("x"));
		tile.setY(rs.getInt("y"));
		tile.setZ(rs.getInt("z"));
		
		return tile;
	}

}
