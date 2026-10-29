import java.util.Scanner;
class Employee {
    int empId;
    String empName;
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
}
class Salary extends Employee {
    double B_Salary,hra,da;
    public Salary(int empId, String empName, double B_Salary) {
        super(empId, empName);
        this.B_Salary = B_Salary;
        this.hra = 0.20 * B_Salary;
        this.da = 0.10 * B_Salary;
    }
}
class NetSalary extends Salary {
    private double deduction,netSalary;
    public NetSalary(int empId, String empName, double B_Salary) {
        super(empId, empName, B_Salary);
        this.deduction = 0.05 * B_Salary;
        this.netSalary = B_Salary + hra + da - deduction;
    }
    void displayDetails() {
        System.out.println("Employee Salary Details");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : Rs. " + B_Salary);
        System.out.println("HRA     : Rs. " + hra);
        System.out.println("DA      : Rs. " + da);
        System.out.println("Deduction : Rs. " + deduction);
        System.out.println("Net Salary    : Rs. " + netSalary);
    }
}
class E_SalaryRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        NetSalary emp = new NetSalary(id, name, basic);
        emp.displayDetails();
        sc.close();
    }
}
