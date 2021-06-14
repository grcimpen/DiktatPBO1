package pbo1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilih;
        Scanner sc = new Scanner(System.in);
        Rectangle shp = new Rectangle();
        Circle shp2 = new Circle();
        do{
            System.out.println("=====================================");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            pilih = sc.nextInt();
            if (pilih == 1){
                System.out.print("Length: ");
                shp.setLength(sc.nextDouble());
                System.out.print("Width: ");
                shp.setWidth(sc.nextDouble());
                System.out.print("Area: ");
                System.out.println(shp.getArea());
            }
            else if (pilih == 2){
                System.out.print("Radius: ");
                shp2.setRadius(sc.nextDouble());
                System.out.print("Area: ");
                System.out.println(shp2.getArea());
            }
            System.out.println("=====================================");
        } while (pilih != 3);


    }
}
