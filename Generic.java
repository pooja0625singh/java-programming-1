import java.util.Scanner;

class UserException extends Exception {
    public UserException() {
        System.out.println("Mismatching type!!! String is found...");
    }
}

class GenericExp {
    public <E> void genMethod(E obj) {
        try {
            char c=String.valueOf(obj).charAt(0);
            if(Character.isDigit(c)) {
                double number = Double.parseDouble(String.valueOf(Integer.parseInt(String.valueOf(obj))));
                System.out.println((number * 2)/3);
            }
            else {
                throw new UserException();
            }
        }
        catch (UserException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Generic{
    public static void main(String[] args) {
        GenericExp us = new GenericExp();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        us.genMethod(sc.next());
    }
}