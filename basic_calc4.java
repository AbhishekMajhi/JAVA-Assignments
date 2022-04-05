// If the marks of Robert in three subjects are 78,45 and 62 respectively 
// (each out of 100 ), write a program to calculate his total marks and 
// percentage marks.

public class basic_calc4 {

    public void mark_per(int a, int b, int c){
        int total = a + b + c;
        System.out.println("Robert's total mark is: "+ total);
        float max_mark = 300; // as we have 3 subjects each 100 marks
        float percent = ((float)total / max_mark) * 100;
        System.out.println("Robert's total percentage is: "+ percent);
    }
    public static void main(String[] args) {

        basic_calc4 obj = new basic_calc4();
        int m1 = 78;
        int m2 = 45;
        int m3 = 62;
        obj.mark_per(m1, m2, m3);
        
    }
}
