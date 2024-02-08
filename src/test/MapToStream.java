package test;

import java.util.*;
import java.util.stream.*; 


public class MapToStream {
	
	public static  Stream<Map.Entry<Integer,String>>  convertMapToStream(Map<Integer,String> map){
		
		return map.
				entrySet()
				.stream();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Map<Integer, String> map = new HashMap<>(); 
		  
	        // Add entries to the Map 
	        map.put(1, "Geeks"); 
	        map.put(2, "forGeeks"); 
	        map.put(3, "A computer Portal"); 
	  
	        // Print the Map 
	        System.out.println("Map: " + map); 
	  
	        // Convert the Map to Stream 
	        Stream<Map.Entry<Integer, String> > stream =  
	                                   convertMapToStream(map); 
	  
	        // Print the TreeMap 
	        System.out.println("Stream: " 
	                      + Arrays.toString(stream.toArray()));
		
			
		
		

	}

}
