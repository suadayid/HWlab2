import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double pi=3.14;
        System.out.println("calculate perimeter of the circle");
        System.out.println("enter the radius of the circle");
        double radius1=in.nextDouble();
        System.out.println("_______________________________________________________");
        System.out.println(2*pi*radius1);
        System.out.println("calculate area of the circle");
        System.out.println("enter the radius of the circle");
        double radius2=in.nextDouble();
        System.out.println(pi*radius2*radius2);
    }


}
