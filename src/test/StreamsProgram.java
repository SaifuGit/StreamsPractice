package test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(7);
		list.add(4);
		list.add(5);
		list.add(7);

		
		//Intermediate operation which transforms the stream to other stream
		
		//map method transform the stream to another stream such as 
		List<Boolean> mapList=list.stream().map(i -> i%2==0).collect(Collectors.toList());
		System.out.println(mapList);
		//filter method Filters the stream and creates new stream such as
		List<Integer> filterList=list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(filterList);
		System.out.println(list.stream() );
		list.stream().filter(i -> i%2==0).forEach(System.out::println) ;
		
		//Terminal Operation which return a final result as an absolute value. e.g collect(),forEach()
		
		
		//sorted()
		List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		// distinct()
		List<Integer> distinctList=list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		//flatmap()
		
		 // making the arraylist object of List of Integer
        List<List<Integer> > number = new ArrayList<>();
       
        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
       
        System.out.println("List of list-" + number);
       
        // using flatmap() to flatten this list
        List<Integer> flatList
            = number.stream()
                  .flatMap(l -> l.stream())
                  .collect(Collectors.toList());
       
        // printing the list
        System.out.println("List generate by flatMap-"
                           + flatList);


		
		


	}

}


