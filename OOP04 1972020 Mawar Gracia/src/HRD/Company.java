package HRD;

import java.util.ArrayList;

public class Company {
    Employee employee;
    ArrayList<Employee> employees;

    public Company(){
        employees = new ArrayList<Employee>();
        Employee baru = new Employee("");
        employee = baru;
        employees.add(baru);
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    public String getNextEmployeeid(){
        int size = employees.size();
        employee = employees.get(size-1);
        if (employee.getId().isEmpty()){
            return "E-00000001";
        }
        else{
            String baru = "E-0000000"+ size;
            return baru;
        }
    }
}
