//Convert two list to map
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l2.add(1);
		l2.add(2);
		l2.add(3);
		Map<String, Integer> m=IntStream.range(0, l2.size())
				.boxed()
				.collect(Collectors.toMap(i->l1.get(i), j->l2.get(j)))
				.entrySet()
				.stream()
				.filter(entry->entry.getValue()>=2)
				.collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));
		System.out.println(m);
		
		

	}

}
