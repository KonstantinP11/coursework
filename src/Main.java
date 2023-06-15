public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван", "Иванович", "Иванов", 1, 15000f);
        employees[1] = new Employee("Иван", "Иванович", "Петров", 2, 25000f);
        employees[2] = new Employee("Иван", "Иванович", "Сидоров", 5, 20000f);
        employees[3] = new Employee("Иван", "Иванович", "Кузнецов", 3, 30000f);
        employees[4] = new Employee("Иван", "Иванович", "Плотников", 3, 35000f);
        employees[5] = new Employee("Иван", "Иванович", "Макаревич", 1, 16000f);
        employees[6] = new Employee("Иван", "Иванович", "Кутиков", 2, 26000f);
        employees[7] = new Employee("Иван", "Иванович", "Маргулис", 5, 21000f);
        employees[8] = new Employee("Иван", "Иванович", "Подгородецкий", 3, 31000f);
        employees[9] = new Employee("Иван", "Иванович", "Державин", 3, 36000f);
        float sumSalary = 0f;
        float minSalary = 1_000_000f;
        float maxSalary = 0f;
        String minSalarySurname = "";
        String maxSalarySurname = "";
        for (Employee e : employees) {
            System.out.println(e);
            sumSalary = e.getSalary() + sumSalary;
            if (minSalary > e.getSalary()) {
                minSalary = e.getSalary();
                minSalarySurname = e.getSurname();
            }
            if (maxSalary < e.getSalary()) {
                maxSalary = e.getSalary();
                maxSalarySurname = e.getSurname();
            }
        }
        System.out.println("sumSalary = " + sumSalary);
        System.out.println("minSalary = " + minSalary + " minSalarySurname " + minSalarySurname);
        System.out.println("maxSalary = " + maxSalary + " maxSalarySurname " + maxSalarySurname);
        System.out.println("Средняя зарплата = " + sumSalary / Employee.counter);
    }

}