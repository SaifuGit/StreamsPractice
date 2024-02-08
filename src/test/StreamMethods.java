package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMethods {
	
	public static String getFirstElementofStreanByREDUCE(Stream<String> stream) {
		
		String s=stream.
				reduce((a,b)-> a)
				.orElse(null);
		
		return s;
	}
	
	public static void forEachTest() {
		Stream<String> stream=Stream.of("saif","quraishi");
	    System.out.println("-----For Each -------");

		stream.forEach(System.out::println);
	    List<Integer> list = Arrays.asList(10, 19, 20,9);
	    System.out.println("------For Each Ordered---------");
	    list.stream().forEachOrdered(s->{System.out.println(s);});
	    System.out.println("------print 2nd index element of String Stream---------");

	    // print 2nd index element of String Stream
		Stream<String> stream2=Stream.of("saif","quraishi");
	    stream2.flatMap(str -> Stream.of(str.charAt(2)))
	    	  .forEachOrdered(System.out::println);

	}
	
	public static void findAnyTest() {
	    List<Integer> list = Arrays.asList(10, 19, 20,9);
	    Stream<Integer> stream=list.stream().filter(x-> x%2==0 );
	    Optional<Integer> op=stream.findAny();
	    List<Integer> list2 = Arrays.asList(20, 19, 10,9);
	    Stream<Integer> stream2=list.stream().filter(x-> x%2==0 );

	    Optional<Integer> op2=stream2.findFirst();

	    System.out.println("----FindAny and findFirst test");
	    if (op.isPresent()) {
            System.out.println(op.get());
            System.out.println(op2.get());

        }
        else {
            System.out.println("no value");
        }
	}
	
	public static void anyMatchTest() {
		System.out.println("----anyMatch test------");
		Stream<Integer> stream=Stream.of(1,3,5,6);
		boolean ans=stream.anyMatch(x->x%2==0);
		System.out.println(ans);
		
		
	}
	
	public static void allMatchTest() {
		System.out.println("----allMatch tests if all elements pass the predicate condition and return boolean------");
		Stream<Integer> stream=Stream.of(2,6,12,16);
		boolean ans=stream.allMatch(x->x%2==0);
		System.out.println(ans);
		
		
	}
	public static void filterTest() {
		System.out.println("----- filter test----");
		Stream<Integer> stream=Stream.of(2,3,4,5,6,7,8,9);
		stream.filter(x->x%2==0).forEach(x->System.out.println(x));
		
	}
	
	public static void sortTest() {
		System.out.println("----sort test-----");
		Stream<Integer> stream =Stream.of(2,4,6,7,34,5,23);
		stream.sorted().forEach(System.out::println);
		Stream<Integer> stream2 =Stream.of(2,4,6,7,34,5,23);

		stream2.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		Stream<Integer> stream3=Stream.of(92,83,4,23,2,25,35,6,67,63,53,33,22,12);
		stream3.sorted((int1,int2) -> Integer.compare(int2, int1)).forEach(System.out::println);

		
	}
	public static void main(String[] args) {
		
		String[] arr= {"How","Are","you"};
		Stream<String> stream=Stream.of(arr);
		String s=getFirstElementofStreanByREDUCE(stream);
		System.out.println(s);
		forEachTest();
		findAnyTest();
		anyMatchTest();
		allMatchTest();
		filterTest();
		sortTest();
	}

}
