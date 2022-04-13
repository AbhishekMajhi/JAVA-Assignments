abstract class flower
{
    abstract void demo();
    
    public void exa(){
        System.out.println("Abstract class");
    }
}
public class TestAbstraction extends flower{
	
	void demo(){
        System.out.println("demo implemented!!");
    }
	public static void main(String[] args) {
		// child class obj
		TestAbstraction obj = new TestAbstraction();
        obj.demo();
        obj.exa();
        // try to create parent class obj.
        flower fl = new TestAbstraction();
        fl.exa();

	
		
	}

}
