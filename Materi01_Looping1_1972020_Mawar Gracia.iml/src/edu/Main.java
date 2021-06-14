package edu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nilai;
        for (int i = 0; i <= 1; i++){
            System.out.println("Semangat kelas PBO 1!");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("nilai : ");
        nilai = sc.nextInt();
        do {
            if (nilai >= 95){
                System.out.println("Grade: A");
            }
            else if (nilai >= 92 || nilai < 95){
                System.out.println("Grade: A-");
            }
            else if (nilai >= 89 || nilai < 92){
                System.out.println("Grade: B+");
            }
            else {
                System.out.println("Grade: below B");
            }
        } while(nilai != 0);
    }
}
