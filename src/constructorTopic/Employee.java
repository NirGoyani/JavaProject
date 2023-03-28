package constructorTopic;

public class Employee {
    String employeeName;
    int employeeId;
    int employeeSalary;

    Employee(String name, int id, int salary){
        employeeName = name;
        employeeId = id;
        employeeSalary = salary;
    }

    Employee(){
        System.out.println("This costructor is called");  //user defined constructor
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Nirav",10,2000);  //One constructor (default)
        Employee employee1 = new Employee();
    }
}
