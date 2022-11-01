package application;

import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes");
        int n = sc.nextInt();

        for (int i =1; i <= n;i++){
            System.out.println("Shape #"+ i +"data:");
            System.out.println("Rectangle or Circle (r/c) ?");
            char shapeType = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED):");
            String shapeColor = sc.nextLine();
            if (shapeType =='r'){
                System.out.print("Width :");
                double shapeWidth = sc.nextDouble();
                System.out.print("Height :");
                double shapeHeight = sc.nextDouble();
            }else {
                System.out.print("Radius :");
                double shapeRadius = sc.nextDouble();
            }
        }


        for (Shape shp: list){
            System.out.printf("%.2f", shp.area());
        }


    }
}