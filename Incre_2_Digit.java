// Take a 4 digit number. Write a program to display a number whose digits are 
// 2 greater than the corresponding digits of the number TAKEN.
// For example, if the number which was taken is 5696, 
//then the displayed number should be 7818.

import java.util.Scanner;


public class Incre_2_Digit {

    // public void upgrade(int num){
    //     int temp,new_number = 0, temp1,rev=0;
    //     while(num != 0){
    //         temp = num % 10;
    //         num =  num / 10;
    //         if (temp == 8)
    //             temp = 0;
    //         else if (temp == 9)
    //             temp = 1;
    //         else 
    //             temp = temp + 2;
            
    //         new_number = new_number * 10 + temp;
    //     }
    //     System.out.println("New num:"+new_number);
    //     while (new_number != 0){
    //         temp1 = new_number % 10;
    //         new_number = new_number / 10;
    //         rev =  rev * 10 + temp1;
    //     }

    //     System.out.println("For number "+ num +" Ans is: "+ new_number);
    // }

    public void upgrade(int num){
        // String n = String.valueOf(num);
        int temp, digit, count=0;
        temp = num;
        String up = "";
        while(num > 0)
        {
            num = num / 10;
            count ++;
        } 
        while(temp > 0){
            digit = temp % 10;
            if (digit == 8){
                digit = 0;
                up = ""+digit;
            }
            else if (digit == 9){
                digit = 1;
                up = ""+digit;
            }
            else{
                digit = 2 + digit;
                up = ""+digit;
            }
            temp = temp % 10;
            count --;

        }
        System.out.print("The upgraded digit is: "+up);
        
    }
    public static void main(String[] args) {
        Incre_2_Digit obj = new Incre_2_Digit();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        int num = sc.nextInt();

        obj.upgrade(num);

    }
}
