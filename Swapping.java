// Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, 
//write two programs to swap the values of the two variables.
//      1 - first program by using a third variable
//      2 - second program without using any third variable

public class Swapping {

    public void swap1(int a, int b)  // swaping using 3rd var..
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Running Swap1: Using 3rd variable.");
        System.out.println("Before swapping a = 6 and b = 8");
        System.out.println("After swapping a = "+ a +" and b= "+ b);

    }

    public void swap2(int a, int b)  // swaping not using 3rd var..
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Running Swap2: Without using 3rd variable.");
        System.out.println("Before swapping a = 6 and b = 8");
        System.out.println("After swapping a = "+ a +" and b= "+ b);

    }
    public static void main(String[] args) {
       
        int a = 6;
        int b = 8;
        Swapping obj = new Swapping();

        obj.swap1(a,b);
        obj.swap2(a,b);
    }
}
