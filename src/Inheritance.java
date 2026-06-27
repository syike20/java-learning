class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + " | Base Salary: $" + baseSalary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, double baseSalary, String programmingLanguage) {
        super(name, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer: " + name + " | Language: " + programmingLanguage + " | Salary: $" + baseSalary);
    }

    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}

class main {
    public static void main(String[] args) {
        Developer dev = new Developer("Alice", 95000, "Java");

        dev.displayDetails();

        dev.writeCode();
    }
}