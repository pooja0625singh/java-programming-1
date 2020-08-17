import java.util.*;
public class Employee_extension {
    public static void main(String[] args) {
        List<Employee> Emp = Arrays.asList(
                new Employee("A01", "Anuj", "Police",50000, "U.P."),
                new Employee("A02", "Preeti", "Executive",60000, "U.P."),
                new Employee("A03", "Pooja", "Data Scientist",70000, "Odisha"),
                new Employee("A04", "Supriya", "Associate",45000, "Maharashtra"),
                new Employee("A05", "Nandeep", "Maintenance",490000, "Madhya Pradesh"),
                new Employee("A06", "Aman", "project Manager",51000, "Manipur"),
                new Employee("A07", "Pardeep", "Content Writer",90000, "Delhi"),
                new Employee("A08", "Roshan", "CEO",1250000, "Mizoram"),
                new Employee("A09", "Utsab", "Android developer",90000, "Punjab"),
                new Employee("A10", "Arpit", "COE",100000, "Meghalaya")
        );
        System.out.println(Emp);
        System.out.println();
        System.out.println("Printing the name of all the employees :");
        Emp.stream().forEach(p -> System.out.println(p.getEmpName()));
        System.out.println();
        System.out.println("Printing the salaries which are greater than 50,000/- :-");
        Emp.stream().filter(s -> s.getEmpSalary() > 50000).forEach(p -> System.out.println(p.getEmpSalary()));
        System.out.println();
        System.out.println("Printing all the locations starting with the letter ‘M’ :-");
        Emp.stream().filter(s -> s.getEmpLocation().startsWith("M")).forEach(p -> System.out.println(p.getEmpLocation()));
        System.out.println();
        System.out.println("Printing all the designations ending with ‘E’ :-");
        Emp.stream().filter(s -> s.getEmpDesignation().endsWith("e")).forEach(p -> System.out.println(p.getEmpDesignation()));
        System.out.println();
    }
}
