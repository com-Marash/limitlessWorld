package com.marash.limitlessWorld.data.map;

import java.util.List;

public class map implements java.io.Serializable  {
	private List<List<tile>> tiles;

	public List<List<tile>> getTiles() {
		return tiles;
	}

	public void setTiles(List<List<tile>> tiles) {
		this.tiles = tiles;
	}
}
