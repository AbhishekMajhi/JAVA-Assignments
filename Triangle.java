public class Triangle {

    public int peri(int s1, int s2, int s3){
        return s1 + s2 + s3;
    }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        int s1 = 2;
        int s2 = 3;
        int s3 = 5;
        System.out.println("perimeter:"+ t.peri(s1, s2, s3));
    }
}
