package desingPatterns.builder;

public class Demo
{
    public static void main(String[] args) {
        //Building the object of Employee thru the build() method provided in EmployeeBuilder class.
        Employee employee = new Employee.EmployeeBuilder("Vikram", 11 ,444.0).setHasBike(false).setHasBike(true).build();
    }
}
