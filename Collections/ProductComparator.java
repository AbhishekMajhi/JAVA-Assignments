import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ProductComparator implements Comparator<ProductComparator>{
	
	int id;
	float price;
	String name;
	
	public ProductComparator() {
		
	}
	
	public ProductComparator(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
    public String toString() {
        return "ID: "+this.id+" Name: "+this.name+" Price: "+this.price;
    }
	@Override
	public int compare(ProductComparator o1, ProductComparator o2) {
//		return o1.id.compareTo(o2.id);  // primitive type not allowed.
		if(o1.id > o2.id)
			return 1;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		ArrayList<ProductComparator> ar = new ArrayList<ProductComparator>();
		ar.add(new ProductComparator(10, "Keyboard", 3500));
		ar.add(new ProductComparator(40, "Speakers", 2000));
		ar.add(new ProductComparator(20, "Mouse", 1500));
		ar.add(new ProductComparator(30, "HeadPhone", 2000));
		

        System.out.println("before sorting" + ar);
        Comparator<ProductComparator> c = new ProductComparator();
        Collections.sort(ar,c);
        System.out.println("After sorting" + ar);

	}
	

}
