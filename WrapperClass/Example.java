package WrapperClass;


// Wrapper Classes (Integer, Byte, Short, Long, Float, Double, Character, Boolean)
public class Example {

	// Using Constructor
	public Example() {
		
	}
	public static void main(String[] args) {
		byte b = 10;  
		short s = 20;  
		int i = 30;  
		long l = 40;  
		float f = 50.0F;  
		double d = 60.0D;  
		char c = 'a';  
		boolean b2 = true; 
		
		Byte btobj = b;
		Short srtobj = s;
		Integer intobj = i;
		Long lngobj = l;
		Float fltobj = f;
		Double dblobj = d;  
		Character chrobj = c;  
		Boolean boolobj = b2;  
		// Boxing 
		System.out.println("******Printing object values******");  
		System.out.println("Byte object: "+btobj);  
		System.out.println("Short object: "+srtobj);  
		System.out.println("Integer object: "+intobj);  
		System.out.println("Long object: "+lngobj);  
		System.out.println("Float object: "+fltobj);  
		System.out.println("Double object: "+dblobj);  
		System.out.println("Character object: "+chrobj);  
		System.out.println("Boolean object: "+boolobj);  
		
		
		// Unboxing implicitly/ auto un boxing
		
		byte bytevalue=btobj;  
		short shortvalue=srtobj;  
		int intvalue= intobj;  
		long longvalue=lngobj;  
		float floatvalue=fltobj;  
		double doublevalue=dblobj;  
		char charvalue=chrobj;  
		boolean boolvalue=boolobj;  
		
		// Now print them
		System.out.println("******Printing primitive values******");  
		System.out.println("byte value: "+bytevalue);  
		System.out.println("short value: "+shortvalue);  
		System.out.println("int value: "+intvalue);  
		System.out.println("long value: "+longvalue);  
		System.out.println("float value: "+floatvalue);  
		System.out.println("double value: "+doublevalue);  
		System.out.println("char value: "+charvalue);  
		System.out.println("boolean value: "+boolvalue);  
		

	}

}
