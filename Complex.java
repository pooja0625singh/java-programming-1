import java.util.Scanner;
public class Complex {
    int r, i;

    Complex(int r, int i) {
        this.r = r;
        this.i = i;
    }
    public static Complex Sum(Complex c1, Complex c2) {
        Complex temp1 = new Complex(0, 0);
        temp1.r = c1.r + c2.r;
        temp1.i = c1.i + c2.i;
        return temp1;
    }
    public static Complex Difference(Complex c1, Complex c2) {
        Complex temp2 = new Complex(0, 0);
        temp2.r = c1.r - c2.r;
        temp2.i = c1.i - c2.i;
        return temp2;
    }
    public static Complex Product(Complex c1, Complex c2) {
        Complex temp3 = new Complex(0, 0);
        temp3.r = c1.r * c2.r;
        temp3.i = c1.i * c2.i;
        return temp3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Complex Number -1 :-");
        System.out.println("Enter real number : ");
        int real1 = sc.nextInt();
        System.out.println("Enter imaginary number : ");
        int imaginary1 = sc.nextInt();
        Complex c1 = new Complex(real1, imaginary1);
        System.out.println("Enter the Complex Number -2 :-");
        System.out.println("Enter real number : ");
        int real2 = sc.nextInt();
        System.out.println("Enter imaginary number");
        int imaginary2 = sc.nextInt();
        Complex c2 = new Complex(real2, imaginary2);
        System.out.println();
        Complex temp1 = Sum(c1, c2);
        System.out.print("Sum is : "+ temp1.r+" + "+ temp1.i +"i");
        System.out.println();
        Complex temp2 = Difference(c1, c2);
        if(temp2.i < 0){
            System.out.println("Difference is: "+ temp2.r+" - "+(temp2.i * (-1))+"i");
        } else{
            System.out.println("Difference is: "+temp2.r+"+"+temp2.i+"i");
        }
        Complex temp3 = Product(c1,c2);
        System.out.print("Product is : "+ temp3.r+" + "+ temp3.i +"i");
    }
}
