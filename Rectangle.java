import java.util.Scanner;
class Rectangle1 {
    int width, height;
    public void display() {
        System.out.println("Width " + width + "  " + "Height " + height);
    }
}
class RectangleArea extends Rectangle1 {
    Scanner sc = new Scanner(System.in);
    public void read_input() {
        System.out.println("Enter Width : ");
        width = sc.nextInt();
        System.out.println("Enter Height : ");
        height = sc.nextInt();
    }
    public void display() {
        super.display();    // It is used when we want to call parent method.
        System.out.println("The area of rectangle : " + width * height);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        RectangleArea obj = new RectangleArea();
        obj.read_input();
        obj.display();
    }
}
