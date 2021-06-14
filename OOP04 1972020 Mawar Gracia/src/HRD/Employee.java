package HRD;

import java.util.Date;
public class Employee extends Person{
    private String id;
    private Date date;

    public Employee(){

    }

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String firstName,Date joinDate, String lastName, String id) {
        super(firstName, lastName);
        this.date = joinDate;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
