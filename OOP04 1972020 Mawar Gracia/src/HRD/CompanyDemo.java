package HRD;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CompanyDemo {

    public static void main(String[] args) {
	// write your code here
        int pilih;
        Scanner sc = new Scanner(System.in);

        System.out.print("Owner first name: ");
        String fOwner = sc.nextLine();
        System.out.print("Owner last name: ");
        String lOwner = sc.nextLine();
        Person own = new Person(fOwner,lOwner);
        System.out.println("Welcome, " + own.getFullName());
        Company company = new Company();
        Owner pemilik = new Owner(company);
        do {
            System.out.println("==================================================");
            System.out.println("1. Add new employee");
            System.out.println("2. View all employee");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            pilih = sc.nextInt();
            if (pilih == 1){
                sc.nextLine();
                System.out.print("Employee first name: ");
                String fName = sc.nextLine();
                System.out.print("Employee last name: ");
                String lName = sc.nextLine();
                System.out.print("Join date (yyyy-mm-dd): ");
                SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
                String tgl = sc.nextLine();
                Date date = null;
                try{
                    date = format.parse(tgl);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                Employee employee = new Employee(fName,date,lName,"0");
                pemilik.addEmployee(employee);
            }
            else if (pilij == 2){
                pemilik.viewAllEmployee();
            }
            else{
                System.out.println("wrong menu");
            }
        } while (pilih != 3);
    }
}
