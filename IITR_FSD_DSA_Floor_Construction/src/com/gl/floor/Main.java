package com.gl.floor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String [] args) {
		
	//write input code here
		
	//for testing only
	FloorConstructionImpl fc = new FloorConstructionImpl( new ArrayList<Integer> (List.of(1,2,3,8,9,10,4,5,7,6))); //input test.
	
	fc.construct();
	
	}
}
