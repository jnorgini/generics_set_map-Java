package generics_set_map;

import java.util.LinkedHashSet;
import java.util.Set;

public class Aula6 {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		set.remove("Tablet");
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for(String p : set) {
			System.out.println(p);
		}
	
	}

}
