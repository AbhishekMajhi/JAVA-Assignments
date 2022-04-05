// Write a program to convert Fahrenheit into Celsius.
import java.util.Scanner;

public class Cel2Far {

    public void cvt(float fah){
        float cel  = (fah - 32) * 0.5556f;
        System.out.println(fah+ " Fahrenheit in deg celsius is: "+ cel);
    }
    public static void main(String[] args) {

        Cel2Far obj = new Cel2Far();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in Fahrenheit:");
        float fah = sc.nextFloat();

        obj.cvt(fah);
        
        
    }
}
