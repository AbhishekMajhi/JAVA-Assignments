// The total number of students in a class are 90 out of which 45 are boys. 
//If 50% of the total students secured grade 'A' out of which 20 are boys, 
//then write a program to calculate the total number of girls getting grade 'A'.

public class Basic_calc5 {
    public static void main(String[] args) {
        int total_std = 90;
        int boys = 45;
        int a_grd = 50 * total_std / 100;
        System.out.println(a_grd);
        int a_grd_boys = 20;
        // THEN num of girs with A grade...
        int a_grd_girls = a_grd - a_grd_boys;
        System.out.println("Number of girls with A grade are "+ a_grd_girls);

    }
}
