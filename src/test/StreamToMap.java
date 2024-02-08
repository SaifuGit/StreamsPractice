package test;

import java.util.Arrays;
import java.util.Map;
import java.io.*;
import java.util.stream.*;

public class StreamToMap {
	
	
	public static Map<String,Integer> convertoToMap(Stream<String> stream){
		
		 return stream.collect(Collectors.toMap( 
                value 
                -> value, 
                value -> value.length()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"Hi","Saif","how", "are","you"};
		Stream<String> stream =Arrays.stream(arr);
		//System.out.println(stream.collect(Collectors.toList()));

		Map<String,Integer> res=convertoToMap(stream);
		System.out.println(res);

	
	}

}
