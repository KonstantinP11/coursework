public class Storage {
    private Employee[] employees = new Employee[10];

    public Storage() {

        employees[0] = new Employee("Иван", "Иванович", "Иванов", 1, 19000);
        employees[1] = new Employee("Иван", "Иванович", "Петров", 2, 25000);
        employees[2] = new Employee("Иван", "Иванович", "Сидоров", 5, 20000);
        employees[3] = new Employee("Иван", "Иванович", "Кузнецов", 3, 30000);
        employees[4] = new Employee("Иван", "Иванович", "Плотников", 3, 35000);
        employees[5] = new Employee("Иван", "Иванович", "Макаревич", 1, 16000);
        employees[6] = new Employee("Иван", "Иванович", "Кутиков", 2, 26000);
        employees[7] = new Employee("Иван", "Иванович", "Маргулис", 5, 21000);
        employees[8] = new Employee("Иван", "Иванович", "Подгородецкий", 4, 31000);
        employees[9] = new Employee("Иван", "Иванович", "Державин", 4, 36000);
    }

    public void printEmployees() {
        for (Employee employees : employees) {
            System.out.println(employees);
        }
    }

    public int countSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    public Employee findPoorEmployee() {
        Employee Employee = employees[0];
        for (Employee employee : employees)
            if (Employee.getSalary() > employee.getSalary()) {
                Employee = employee;
            }
        return Employee;
    }

    public Employee findRichEmployee() {
        Employee richEmployee = employees[0];
        for (Employee employee : employees)
            if (richEmployee.getSalary() < employee.getSalary()) {
                richEmployee = employee;
            }
        return richEmployee;
    }

    public double calculeteAverageSalary() {
        double averageSalary = countSalary() / employees.length;
        return averageSalary;
    }

    public void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public void increaseSalary(double percentIncrease) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * (1 + percentIncrease / 100));
        }
    }

    public Employee findPoorEmployeeDepartment(int department) {
        Employee Employee = findRichEmployee();
        for (Employee employee : employees)
            if (Employee.getSalary() > employee.getSalary() && employee.getDepartment() == department) {
                Employee = employee;
            }
        return Employee;
    }
    public Employee findRichEmployeeDepartment(int department) {
        Employee Employee = findPoorEmployee();
        for (Employee employee : employees)
            if (Employee.getSalary() < employee.getSalary() && employee.getDepartment() == department) {
                Employee = employee;
            }
        return Employee;
    }

}

