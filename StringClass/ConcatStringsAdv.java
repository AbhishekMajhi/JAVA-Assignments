package StringClassPrograms;

/**************** Write a program to concatenate StringBuilder & StringBuffer objects.************/


public class ConcatStringsAdv {

	public static void main(String[] args) {
		StringBuilder sbd = new StringBuilder();
		sbd.append("Ultimate");
		
		StringBuffer sbr = new StringBuffer();
		sbr.append("Dude");
		sbd.append(sbr);
		
//		System.out.println("StringBuilder:"+sbd);
//		System.out.println("StringBuffer:"+sbr);
		System.out.println("StringBuilder + StringBuffer : "+sbd);
		
	}

}
