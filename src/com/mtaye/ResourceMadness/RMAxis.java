package com.mtaye.ResourceMadness;

/**
 * ResourceMadness for Bukkit
 *
 * @author M-Taye
 */
public enum RMAxis{
	X,Y,Z,NONE;
	
	private RMAxis(){
	}
	
	public RMAxis getDirAxis(RMDir dir){
		switch(dir){
		case NORTH: case SOUTH: return RMAxis.X;
		case EAST: case WEST: return RMAxis.Z;
		case UP: case DOWN: return RMAxis.Y;
		}
		return RMAxis.NONE;
	}
}

