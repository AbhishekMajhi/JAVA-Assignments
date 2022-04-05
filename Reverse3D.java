
import java.util.Scanner;
public class Reverse3D {

    public void rev(int num){
        String temp = String.valueOf(num);
        StringBuilder ip = new StringBuilder();
        ip.append(temp);
        ip.reverse();
        System.out.println("Reverse of "+num+ " is "+ip);
    }  
    public static void main(String[] args) {
        Reverse3D obj = new Reverse3D();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int num = sc.nextInt();
        obj.rev(num);
    }
}
