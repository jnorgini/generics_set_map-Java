package generics_set_map;

import java.util.Set;
import java.util.TreeSet;

import entities.Product2;

public class Aula8 {

	public static void main(String[] args) {
		
		Set<Product2> set = new TreeSet<>();
		
		set.add(new Product2("Tv", 900.0));
		set.add(new Product2("Notebook", 1200.0));
		set.add(new Product2("Tablet", 400.0));
		
		for(Product2 p : set) {
			System.out.println(p);
		}

	}

}
