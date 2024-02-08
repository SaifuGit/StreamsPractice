package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

//write a program to calculate total population and lowest diameter of the planet?
public class Question1 {
	
	
	
	public static void main(String[] args) {

		
		List<Planet> list=new ArrayList<>();
		list.add(new Planet("Yavin IV", 10200, 1000));
		list.add(new Planet("Hoth", 7200, 10000));
		list.add(new Planet("Dagobah", 8900, 0));
		list.add(new Planet("Endor",  4900, 30000000));
		list.add(new Planet("Endor",  4900, 30000000));
		 Optional<Planet> op=list.stream().sorted((p1,p2) ->Integer.compare(p1.diameter, p2.diameter))
		.findFirst();
		 OptionalInt res2=list.stream().mapToInt(x->x.diameter).min();
			System.out.println(res2.getAsInt());

		 System.out.println(op.get().diameter);
		 int res=list.stream().mapToInt(x->x.population).sum();
		System.out.println(res);
		System.out.println("End of program");
		System.out.println("End of program");
		System.out.println("End of program");

	}
	

}

class Planet{
	
	
	int diameter;
	String name;
	int population;
	public Planet( String name,int diameter, int population) {
		super();
		this.diameter = diameter;
		this.name = name;
		this.population = population;
	}
	
}
