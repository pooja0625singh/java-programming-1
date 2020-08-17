public class Employee {
    private String empId;
    private String empName;
    private String empDesignation;
    private int empSalary;
    private String empLocation;

    public Employee(String empId, String empName, String empDesignation, int empSalary, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpDesignation() {
        return empDesignation;
    }
    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
    public int getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
    public String getEmpLocation() {
        return empLocation;
    }
    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary='" + empSalary + '\'' +
                ", empLocation='" + empLocation +
                '}';
    }
}
