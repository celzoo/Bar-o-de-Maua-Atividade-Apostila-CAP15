import java.util.*;
public class Main {

	public static void main(String[] args) {
			Collection<Integer> thirty= new ArrayList<>();
			long inicio = System.currentTimeMillis();
			Integer total = 30000;
			Integer i;
			for(i=0;i<total;i++) {
				thirty.add(i);
			}
			
			for(i=0;i<total;i++) {
				System.out.println(thirty.contains(i)); 
			}
			long end = System.currentTimeMillis();
			
			long time = end - inicio;
			System.out.println(time);
			
			
			Collection<Integer> thirtyhash= new HashSet();
			long iniciohash = System.currentTimeMillis();
			
		
			for(i=0;i<total;i++) {
				thirtyhash.add(i);
			}
			
			for(i=0;i<total;i++) {
				System.out.println(thirtyhash.contains(i)); 
			}
			long endhash = System.currentTimeMillis();
			
			long timehash = endhash - iniciohash;
			System.out.println(timehash);

	}

}
