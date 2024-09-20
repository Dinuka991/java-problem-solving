package desingPatterns.builder;

public class Employee {

    private String name;
    private int age;
    private double salary;
    private boolean hasCar; // optional
    private boolean hasBike; // optional

    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.salary = builder.salary;
        this.hasCar = builder.hasCar;
        this.hasBike = builder.hasBike;
    }

    public static class EmployeeBuilder {
        private String name;
        private int age;
        private double salary;
        private boolean hasCar; // optional
        private boolean hasBike; // optional

        // constructor for required fields
        public EmployeeBuilder(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        // setter methods for optional fields
        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        // build the Employee object
        public Employee build() {
            return new Employee(this);
        }
    }
}
