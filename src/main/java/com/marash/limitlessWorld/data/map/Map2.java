package com.marash.limitlessWorld.data.map;

import java.util.ArrayList;

public class Map implements java.io.Serializable  {
	private ArrayList<ArrayList<Tile>> tiles;

	public ArrayList<ArrayList<Tile>> getTiles() {
		return tiles;
	}

	public void setTiles(ArrayList<ArrayList<Tile>> tiles) {
		this.tiles = tiles;
	}

	
}
