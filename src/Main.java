public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.printEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц = " + storage.countSalary());
        System.out.println("Сотрудник с самой низкой зарплатой = " + storage.findPoorEmployee());
        System.out.println("Сотрудник с самой высокой зарплатой = " + storage.findRichEmployee());
        System.out.println("Средняя зарплата = " + storage.calculeteAverageSalary());
        storage.printFullName();
    }
}

