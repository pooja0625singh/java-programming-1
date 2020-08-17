import java.util.Scanner;
public class Calculator {
    @FunctionalInterface
    interface add {
        public int addition(int a, int b);
    }

    @FunctionalInterface
    interface subtract {
        public int subtraction(int a, int b);
    }

    @FunctionalInterface
    interface multiply {
        public int multiplication(int a, int b);
    }

    @FunctionalInterface
    interface divide {
        public double division(double a, double b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 5 to perform the operation you want: 1 - Add | 2 - Difference | 3 - Product | 4 - Division | 5 - perform all operation :-");
        int num = sc.nextInt();
        add add_fun = (int a, int b) -> {return a + b;};
        subtract differece_fun = (int a, int b) -> {return a - b;};
        multiply product_fun = (int a, int b) -> {return a * b;};
        divide division_fun = (double a, double b) -> {
            if (b == 0) return 0;
            return a / b;
        };
        if(num == 1) {
            System.out.println("Addition of 30 and 20 is " + add_fun.addition(30,20));
        } else if(num == 2) {
            System.out.println("Difference of 30 and 20 is " + differece_fun.subtraction(30,20));
        } else if(num == 3) {
            System.out.println("Product of 30 and 20 is " + product_fun.multiplication(30,20));
        } else if(num == 4) {
            System.out.println("Division of 30 and 20 is " + division_fun.division(30,20));
        } else if(num == 5) {
            System.out.println("Addition : " + add_fun.addition(30,20));
            System.out.println("Difference : " + differece_fun.subtraction(30,20));
            System.out.println("Product : " + product_fun.multiplication(30,20));
            System.out.println("Division : " + division_fun.division(30,20));
        } else {
            System.out.println("Please enter valid number????");
        }
    }
}
