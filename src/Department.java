import java.util.ArrayList;

public class Department {
    private String orgName = "Best ORG";
    private int departmentId;
    public String departmentName;
    ArrayList<Employee> employees = new ArrayList<Employee>();
    //private int depId = 0;

    @Override
    public String toString() {
        return "Department{" +
                "orgName='" + orgName + '\'' +
                ", departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                '}';
    }

    public Department() {
        this.orgName = orgName;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = employees;
    }


    public Department(String departmentName, int departmentId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = new ArrayList<Employee>();
    }

    public Department(String departmentName, int departmentId, ArrayList<Employee> employees) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = employees;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getEmployeeNumber() {
        return employees.size();
    }

    public double getAllSalary() {
        double total = 0;
        for (int i = 0; i < employees.size(); i++) {
            total += employees.get(i).getSalary();
        }
        return total;
    }

    public Employee getEmployeeByName(String name, String surname) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name) && employee.getSurname().equals(surname)) {
                return employee;
            }

        }
        return null;
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Поприветствуем нового работника: " + employee.getName() +" " + employee.getSurname());
    }

    public void fireEmployee(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName() == employee.getName() && employees.get(i).getSurname() == employee.getSurname()) {
                employees.remove(employees.get(i));
                System.out.println("Уволен: " + employee.getName() +" " + employee.getSurname());
            }
        }
    }
}
