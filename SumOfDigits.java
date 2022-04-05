//Write a program to calculate the sum of the digits of a 3-digit number.
import java.util.Scanner;
public class SumOfDigits {

    public int sumofdigits(int num){
        int temp, a,cnt = 0;
        int sum = 0;
        temp = num;
        while(num > 0)
        {
            num = num / 10;
            cnt++;
        }
        while(temp > 0)
        {
            a = temp % 10;
            sum = sum + a;
            temp = temp / 10;
            cnt--;
        }

        return sum;
    }
    public static void main(String[] args) {
        int num;
        SumOfDigits obj = new SumOfDigits();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any number:");
        num = s.nextInt();
        int sum = obj.sumofdigits(num);
        System.out.println("Sum of each digit of number "+num+ " is "+sum);
    }
}
