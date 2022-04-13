import java.util.TreeSet;
import java.util.TreeMap;

public class TreeSetExa {

	public static void main(String[] args) {
		
		// TreeSet Example.
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Me");
		ts.add("Alice");
		ts.add("Alex");
		System.out.println("Here they are ------->>> "+ts);
		
		// TreeMap Example.
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Me",100);
		tm.put("Alice", 200);
		tm.put("Alex", 300);
		
		System.out.println("Here they are again in full force ----------->>>>> "+ tm);

	}

}
