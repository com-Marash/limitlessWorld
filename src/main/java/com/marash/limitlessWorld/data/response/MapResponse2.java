package com.marash.limitlessWorld.data.response;

import com.marash.limitlessWorld.data.map.Map;

public class MapResponse implements java.io.Serializable{
	Map map;

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}
}
