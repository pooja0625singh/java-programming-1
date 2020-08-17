import java.util.*;
public class EmployeeInfo {
    String Name;
    int yearOfJoining;
    String Address;

    public void display() {
        System.out.println(Name + "\t\t"+ yearOfJoining + "\t\t\t" + Address);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EmployeeInfo> info = new ArrayList<EmployeeInfo>();
        System.out.println("Enter the number of persons data you want to enter :- ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            EmployeeInfo e1 = new EmployeeInfo();
            sc.nextLine();
            System.out.println("Enter the name : ");
            e1.Name = sc.nextLine();
            System.out.println("Enter the address : ");
            e1.Address = sc.nextLine();
            System.out.println("Enter the year of joining : ");
            e1.yearOfJoining = sc.nextInt();
            info.add(e1);
        }
        System.out.println("Name" + "\t\t" + "yearOfJoining" + "\t" + "  Address");
        info.stream().forEach(s -> s.display() );
    }
}
