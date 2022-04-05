
// Assign values of variables 'a' and 'b' as 55 and 70 respectively and then 
// check if both the conditions 'a < 50' and 'a < b' are true.

public class basic_calc3 {
    public static void main(String[] args) {
        int a = 55;
        int b = 70;

        if (a < 50){
            System.out.println("Condition a < 50 is satisfied!");
        }
        else
        {
            System.out.println("Condition a < 50 is not satisfied!");
        }
    
        if (a < b){
            System.out.println("Condition a < b is satisfied!");
        }
        else
            System.out.println("Condition a < b is not satisfied!");

    }
}