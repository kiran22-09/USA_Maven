package com.ablelogix.Orange_Hrm.class1;

public class RegionsBiz {
	
	public boolean ChkregIdEmpty(String regionID) {
		if(regionID.length()==0) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean ChkregNameEmpty(String regionName) {
		if(regionName.length() == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public  boolean ChkRegIDOptions(String regionID) {
		if(regionID.equals("NRT") || regionID.equals("ASA") || regionID.equals("EUR") ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public  boolean ChkRegNameOptions(String regionName) {
		if(regionName.equals("NorthAmerica") || regionName.equals("Asia") || regionName.equals("Europe") ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
