package oops;

public class employee {
    private int salary;

    public employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("working as a employee");
    }

    public int getSalary() {
        return salary;
    }
}
  class HRmanager extends employee{
    public HRmanager(int salary) {
     // Call the parent class constructor with the salary
     super(salary);
 }

     public void work() {
         System.out.println("\nManaging employees");
     }
     public void addEmployee() {
         System.out.println("\nAdding new employee!");
     }
 }
  class Main {
    public static void main(String[] args) {
        employee emp = new employee(40000);
        HRmanager mgr = new HRmanager(70000);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());

        mgr.addEmployee();
    }
}


