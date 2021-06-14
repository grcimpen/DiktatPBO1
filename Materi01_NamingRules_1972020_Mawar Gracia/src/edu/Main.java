package edu;

public class Main {
    private int studentName;
    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setStudentName(int studentName) {
        this.studentName = studentName;
    }

    public static void main(String[] args) {
        String studentName = "Jane Doe";
        System.out.println(studentName);
    }
}
