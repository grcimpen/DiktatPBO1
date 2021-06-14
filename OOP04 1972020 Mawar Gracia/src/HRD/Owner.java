package HRD;

import java.util.ArrayList;

public class Owner extends Person{
    Company company;
    public Owner(Company company){
        this.company = company;
    }

    public void addEmployee(Employee employee){
        ArrayList<Employee> newArray = company.getEmployees();
        String newId = company.getNextEmployeeid();
        employee.setId(newId);
        newArray.add(employee);
    }

    public void viewAllEmployee(){
        ArrayList<Employee> newArray = company.getEmployees();
        if (newArray.size() == 1){
            System.out.println("No data");
        }
        else{
            int size = newArray.size();
            Employee view;
            System.out.printf("%-20s %-15s %-15s %n","ID","NAME","JOIN DATE");
            for (int i=1; i<size; i++) {
                view = newArray.get(i);
                System.out.printf("%-20s %-15s %-15s %n", view.getId(), view.getFullName(),view.getDate());
            }
        }
    }
}
