import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int deptId = 0;

        //работники для добавления
        Employee emp1 = new Employee("Alibek", "Alibekov");
        Employee emp2 = new Employee("Bek", "Bekov");
        Employee emp3 = new Employee("Valibek", "Valibekov", 60000.0, "ceo");
        Employee emp4 = new Employee("John", "Doe", 40000.0, "auditor");
        Employee emp5 = new Employee();

        //для добавления списком
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);
        employeeArrayList.add(emp3);
        employeeArrayList.add(emp4);
        employeeArrayList.add(emp5);

        //создание департаментов
        Department d1 = new Department("IT", deptId++);
        Department d2 = new Department("DepName", deptId++, employeeArrayList);

        //найм в 1й департамент по одному
        d1.hireEmployee(emp1);
        d1.hireEmployee(emp2);
        d1.hireEmployee(emp3);
        d1.hireEmployee(emp4);
        d1.hireEmployee(emp5);

        //отображение информации
        System.out.println("AllSalary of " + d1.getDepartmentName() + " = " + +d1.getAllSalary());
        System.out.println("EmployeeNumber of " + d1.getDepartmentName() + " = " + d1.getEmployeeNumber());
        System.out.println(d1.toString());
        System.out.println();

        d1.fireEmployee(emp1);
        System.out.println("AllSalary of " + d1.getDepartmentName() + " = " + +d1.getAllSalary());
        System.out.println("EmployeeNumber of " + d1.getDepartmentName() + " = " + d1.getEmployeeNumber());
        System.out.println(d1.toString());
        System.out.println();

        d1.fireEmployee(emp5);
        System.out.println("AllSalary of " + d1.getDepartmentName() + " = " + +d1.getAllSalary());
        System.out.println("EmployeeNumber of " + d1.getDepartmentName() + " = " + d1.getEmployeeNumber());
        System.out.println(d1.toString());
        System.out.println();

        System.out.println(d2.toString());
        System.out.println();

    }
}