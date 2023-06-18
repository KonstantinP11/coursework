public class Employee {
    private String firstName;
    private String patronymic;
    private String surname;
    private int department;
    private int salary;
    private int id;
    public static int counter = 0;

    public Employee(String firstName, String patronymic, String surname, int department, int salary) {
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                ", salary=" + salary;
    }

    public String getFullName() {
        return "ФИО " + surname + " " + firstName + " " + patronymic;
    }
}