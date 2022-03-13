package com.gs.test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGenerateEmail {

    public List<Employee> getEmployeeList() {
        Employee employee1 = new Employee("Manohar", "Badiger", "Technical");
        Employee employee2 = new Employee("Anveeth", "Badiger", "Admin");
        Employee employee3 = new Employee("Anush", "Badiger", "legal");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        for(Employee e: employeeList){
            if(e.getDepartName().equalsIgnoreCase("Technical")){
                e.setEmailAddress(e.getFirstName()+"."+e.getLastName()+"@"+"tech.abc.com");
            }
            if(e.getDepartName().equalsIgnoreCase("Admin")){
                e.setEmailAddress(e.getFirstName()+"."+e.getLastName()+"@"+"admin.abc.com");
            }
            if(e.getDepartName().equalsIgnoreCase("legal")){
                e.setEmailAddress(e.getFirstName()+"."+e.getLastName()+"@"+"legal.abc.com");
            }
        }
        return employeeList;
    }
}
