package vjezba1;

import java.text.DecimalFormat;
import java.util.ArrayList;

//veza klasa Cars

import java.util.HashSet;

public class CarsMain {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		ArrayList<Cars> cars = new ArrayList<>();
		cars.add(new Cars("Audi", "A6", 100, 2000));
		cars.add(new Cars("Audi", "A4", 120, 2001));
		cars.add(new Cars("Audi", "A3", 190, 2009));
		cars.add(new Cars("Audi", "A8", 220, 2017));
		cars.add(new Cars("BMW", "M3", 420, 2016));
		cars.add(new Cars("BMW", "M2", 320, 2016));
		cars.add(new Cars("Volvo", "D5", 180, 2010));
		cars.add(new Cars("Mercedes", "CLK", 200, 2007));
		cars.add(new Cars("Audi", "A5", 170, 2005));
		cars.add(new Cars("Audi", "A3", 100, 2009));
		cars.add(new Cars("Audi", "A1", 100, 2002));
		
		
		for(Cars value : cars) {
			System.out.println(value);
				
		}
		
		
		long endTime = System.nanoTime();
//		long duratNano = endTime - startTime;
//		System.out.println(duratNano);
		double duration = ((double) endTime - (double) startTime) / 1_000_000_000.0;
		DecimalFormat df = new DecimalFormat("#.#######");
				
		
		System.out.println("Car on index position 4 is " + cars.get(4));
		
		System.out.println("Duration of creating a list in seconds: " + df.format(duration));
		
//
//		HashSet<Cars> cars2 = new HashSet<Cars>();
//		cars2.add(new Cars("Audi", "A6", 100, 2000));
//		cars2.add(new Cars("Audi", "A4", 120, 2001));
//		cars2.add(new Cars("Audi", "A3", 190, 2009));
//		cars2.add(new Cars("Audi", "A8", 220, 2017));
//		cars2.add(new Cars("BMW", "M3", 420, 2016));
//		cars2.add(new Cars("BMW", "M2", 320, 2016));
//		cars2.add(new Cars("Volvo", "D5", 180, 2010));
//		cars2.add(new Cars("Mercedes", "CLK", 200, 2007));
//		cars2.add(new Cars("Audi", "A5", 170, 2005));
//		cars2.add(new Cars("Audi", "A3", 100, 2009));
//		cars2.add(new Cars("Audi", "A1", 100, 2002));
//		
//		
//		
//		for(Cars value : cars2) {
//			System.out.println(value);
//		}
		
		

	}

}
