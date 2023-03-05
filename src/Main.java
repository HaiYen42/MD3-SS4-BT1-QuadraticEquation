import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhập a");
        a= input.nextDouble();
//        if (a==0){
//            System.out.println("Vui lòng nhập a khác 0");
//            System.out.println("Nhập a");
//            a= input.nextDouble();
//        }
        while(a==0) {
            System.out.println("Vui lòng nhập a khác 0");
            System.out.println("Nhập a");
        }
        do {
            System.out.print("Nhập a: ");
            a= input.nextDouble();
            if (a==0){
                System.out.println("Vui lòng nhập a khác 0");
            }
        } while(a==0);
        System.out.print("Nhập b: ");
        b= input.nextDouble();
        System.out.println("Nhập c: ");
        c= input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
            double delta= equation.getDiscriminant();
            double root1= equation.getRoot1();
            double root2= equation.getRoot2();
        if (delta<0){
            System.out.println(" Phương trình vô nghiệm");
        }else if(a==0){
            System.out.println("Phương trình có 1 nghệm là "+ root1);
        }else{
            System.out.println("Phương trình có 2 nghiệm là "+ root1+ " "+ root2);
        }

    }
}