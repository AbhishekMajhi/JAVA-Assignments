package StringClassPrograms;

/************* Write a program to get a substring of a StringBuffer.*********************/
								  /** & **/
/**** Write a program to display the length and capacity of String, StringBuilder and StringBuffer.*****/

public class GetStringBufferSubString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("UltimateDude");
		System.out.println("Full Dtring : "+sb);
		// Get the substring after index 2
		System.out.println("SubSting : "+sb.substring(8));
		
		// Get the Length & capacity.
		
		System.out.println("Length : "+sb.length());
		System.out.println("Capacity : "+sb.capacity());
		
	}

}
