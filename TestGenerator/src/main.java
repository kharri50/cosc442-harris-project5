import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {

		ArrayList <Character>symbols = new ArrayList<Character>();
		symbols.add(')');
		genTests(1,1,symbols, 0,9, "/no");
		
		symbols.clear();
		
		symbols.add(')');
		symbols.add('(');

		
		genTests(2,2,symbols, 1,9, "/no");
		
		genTests(3,2,symbols,1,9,"/no");
		
		symbols.clear();
		symbols.add('(');
		genTests(5,5,symbols,0,9,"/no");
		
		symbols.clear();
		symbols.add(')');
		genTests(6,1,symbols,0,9,"/no");

		

		


		
	}
	
	/* This function automatically generates the test 
	 * Criteria for use with the W-Method. It's a lot faster
	 * than manually defining everything.
	 */
	
	public static void genTests(int to, int from,ArrayList<Character> symbols, int low, int high, String out) {
		Iterator charItr = symbols.iterator();
		while (charItr.hasNext()) {
			System.out.println(to+" "+from+" "+charItr.next()+out);
		}
		// now handle the case where there are a range of numbers
		for(int i = low; i<=high; i++) {
			System.out.println(to+" "+from+" "+i+out);
		}
	}

}
