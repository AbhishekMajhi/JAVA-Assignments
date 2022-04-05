 //Write a program to calculate the sum of the first and the second last 
//digit of a 5 digit.  E.g.- NUMBER : 12345        OUTPUT : 1+4=5
import java.util.Scanner;

public class Question13 {

    public void calc(int num){
        String s=String.valueOf(num);  // convert int to string 
        // System.out.println(s.charAt(0)+" and "+ s.charAt(3));
        int sum = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(3));
        System.out.println("For number "+num+" sum is: "+ sum);
    }
    public static void main(String[] args) {
        Question13 obj = new Question13();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        int num = sc.nextInt();
        obj.calc(num);
    }
}
