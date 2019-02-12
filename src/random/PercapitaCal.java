package random;

import java.util.ArrayList;
import java.util.List;

public class PercapitaCal {
	public static void main(String[] args) {
		Percapita p1 = new Percapita("Bangalore", "India", 'M', "INR", 90000);
		Percapita p2 = new Percapita("Bangalore", "India", 'F', "INR", 85000);
		Percapita p3 = new Percapita("HYD", "India", 'M', "INR", 80000);
		Percapita p4 = new Percapita("TS", "India", 'F', "INR", 20000);
		Percapita p5 = new Percapita("Britain", "", 'M', "EUR", 100000);
		Percapita p6 = new Percapita("London", "", 'F', "EUR", 70000);
		Percapita p7 = new Percapita("Chicago", "USA", 'M', "USD", 50000);
		Percapita p8 = new Percapita("NY", "USA", 'F', "USD", 3000);
		
		List<Percapita> list  = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		
		System.out.println(p4.getCounrty());
		//list.sort(c);
		
		
	}
}
