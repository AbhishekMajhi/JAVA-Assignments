public class Rectangle {

    public int area(int l, int b){
        return l * b;
    }
    public int perimeter(int l, int b){
        return 2*(l + b);
    }
    public static void main(String[] args) {
        int len = 5;
        int bre = 7;

        Rectangle obj = new Rectangle();
        System.out.println("Area: "+obj.area(len, bre));
        System.out.println("Perimeter: "+obj.perimeter(len, bre));

    }
    
}
