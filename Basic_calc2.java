 
// Write a program to print the power of 7 raised to 5.

public class Basic_calc2 {
    public static void main(String[] args) {
    
        int base = 7;
        int exp = 5;
        int res = 1;
        for (; exp != 0; --exp) {
            res *= base;
          }
        System.out.println("Power of "+ base + " raise 5 to is " + res);

    }
}