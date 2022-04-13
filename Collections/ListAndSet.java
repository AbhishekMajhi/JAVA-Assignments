package CollectionExa;
import java.util.*;
/** Create a List & Set of 10 integers and demonstrate ordered and unordered collection as well as 
 * duplicate allowed and not allowed. Demonstrate addAll() method also.
**/

public class ListAndSet {

	public static void main(String[] args) {
		// List
		List<Integer> lst = new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		lst.add(60);
		lst.add(70);
		lst.add(80);
		lst.add(90);
		lst.add(100);
		System.out.println("<------------------ List ----------------->");
		System.out.println(lst);
		
		// With addAll()
		List<Integer> lst2 = new ArrayList<>();
		lst2.addAll(0, lst);  // or we can directly do that..
		//List<Integer> lst2 = new ArrayList<>(lst);
		lst2.add(110);
		lst2.add(120);
		lst2.add(130);
		lst2.add(140);
		lst2.add(150);
		lst2.add(160);
		System.out.println("After adding lst: "+lst2);
		System.out.println("List is ordered!!");
		
		System.out.println("Another Task");
		// Create a List of 10 Integer objects and try to access 15th index. Properly analysis the output.
		System.out.println("In list2 the 15th index element is: "+ lst2.get(15));
		////////////////////////// Set //////////////////////
		
		Set<Integer> st = new HashSet<>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);
		st.add(60);
		st.add(70);
		st.add(80);
		st.add(90);
		st.add(100);
		
		System.out.println("<------------------ Set ----------------->");
		System.out.println(st);
		
		// With addAll()
		Set<Integer> st2 = new HashSet<>();
		st2.addAll(st);  // or we can directly do that..
		//List<Integer> lst2 = new ArrayList<>(lst);
		st2.add(110);
		st2.add(120);
		System.out.println("After adding st: "+st2);
		System.out.println("List is unordered!! You can see that from the O/P.");
	}

}
