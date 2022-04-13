import java.util.HashSet;
import java.util.TreeSet;


public class ProductComparableExa implements Comparable<ProductComparableExa>{
	
	int id;
	float price;
	String name;
	
	public ProductComparableExa(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
    public String toString() {
        return "ID: "+this.id+" Name: "+this.name+" Price: "+this.price;
    }
	@Override
    public int compareTo(ProductComparableExa p) {
        if (id > p.id)
        	return 1;
        else
        	return -1;
    }
	public static void main(String args[]) {
		HashSet<ProductComparableExa> cset=new HashSet<>();
        cset.add(new ProductComparableExa(10, "Keyboard", 3500));
        cset.add(new ProductComparableExa(20, "Mouse", 1500));
        cset.add(new ProductComparableExa(30, "HeadPhone", 2000));
        cset.add(new ProductComparableExa(40, "Speakers", 2000));

        System.out.println("before sorting" + cset);
        TreeSet<ProductComparableExa> tcat=new TreeSet<>(cset);
        System.out.println("After sorting" + tcat);
	}

}
