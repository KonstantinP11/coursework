public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        System.out.println("Сумма затрат на зарплаты в месяц = " + storage.countSalary());
        System.out.println("Сотрудник с самой низкой зарплатой = " + storage.findPoorEmployee());
        System.out.println("Сотрудник с самой высокой зарплатой = " + storage.findRichEmployee());
        System.out.println("Средняя зарплата = " + storage.calculeteAverageSalary());
        storage.printFullName();
        double percentIncreaseSalary = 0;
        storage.increaseSalary(percentIncreaseSalary);
        storage.printEmployees();
        int department = 2;
        System.out.println("Сотрудник с самой низкой зарплатой в отделе " + department + " = " + storage.findPoorEmployeeDepartment(department));
        System.out.println("Сотрудник с самой высокой зарплатой в отделе " + department + " = " + storage.findRichEmployeeDepartment(department));
        double salaryLess = 20000;
        storage.printEmployeesSalaryLess(salaryLess);
        storage.printEmploeesDepartment();
    }
}

