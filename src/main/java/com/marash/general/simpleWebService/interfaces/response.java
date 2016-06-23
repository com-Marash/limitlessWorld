package com.marash.general.simpleWebService.interfaces;

public class response {
	private String message ="";
	private Boolean toShow =false;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getToShow() {
		return toShow;
	}
	public void setToShow(Boolean toShow) {
		this.toShow = toShow;
	}
	
}
