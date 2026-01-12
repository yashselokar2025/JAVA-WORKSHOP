class Employee {

    int empId = 101;
    String name = "Amit";
    double salary = 55000.50;
    void display() {
        System.out.println("Employee ID: "+ empId);
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
    }
}
public class Employee_Details {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
    }
}