import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input the variables ");
        int x=in.nextInt();
        int y=in.nextInt();
        int temp=x;
        x=y;
        System.out.println("________________________________________");
        y=temp;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }


}
