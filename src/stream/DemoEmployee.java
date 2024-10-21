package stream;

import java.util.*;
import java.util.stream.Collectors;

public class DemoEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee("Sam" ,43430.00 , 33,"IT");
        Employee employee2 = new Employee("Ang" ,34430.00 , 38 ,"IT");
        Employee employee3 = new Employee("Jay" ,22430.00 , 39, "SETM");
        Employee employee4 = new Employee("Kim" ,91430.00 , 40,"SETM");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        System.out.println(findEmployeeWithMaxSalary(employeeList));
        System.out.println(groupByDepartment(employeeList));

    }

     public static Optional<Employee> findEmployeeWithMaxSalary(List<Employee> employeeList){
        return employeeList.stream().max(Comparator.comparing(Employee::getSalary));
     }


     public static  Map<String,List<Employee>> groupByDepartment(List<Employee> employeeList){
         return  employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
     }








}
