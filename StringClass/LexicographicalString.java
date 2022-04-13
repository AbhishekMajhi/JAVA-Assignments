package StringClassPrograms;


// Write a program to lexicographically arrange the given 
//strings "Raman" , "Aman" , "Vikram" , "Shyam" and "Bhuvan".

public class LexicographicalString {

	public static void main(String[] args) {
		String s[] = {"Raman" , "Aman" , "Vikram" , "Shyam", "Bhuvan"};
		int n = s.length;
		System.out.println("Before Sorting");  
        for(int i = 0; i < n; i++) {  
        	System.out.println(s[i]);  
        }
	    for(int i = 0; i < n-1; ++i) {  
	          for (int j = i + 1; j < n; ++j) {  
	             if (s[i].compareTo(s[j]) > 0) {  
	                String temp = s[i];  
	                s[i] = s[j];  
	                s[j] = temp;  
	             }  
	          }  
	    }
	    System.out.println("\nAfter performing lexicographical order: ");  
        for(int i = 0; i < n; i++) {  
           System.out.println(s[i]);  
        }  

	}

}
