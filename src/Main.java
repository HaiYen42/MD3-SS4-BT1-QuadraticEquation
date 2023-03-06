import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        do{
            System.out.println("Enter a");
            a= input.nextDouble();
            if (a==0){
                System.out.println("VUi lòng nhập a khác 0");
            }

        }while (a==0);
        System.out.println("Enter b");
        b= input.nextDouble();
        System.out.println("Enter c");
        c= input.nextDouble();
        QuadraticEquation equation= new QuadraticEquation(a,b,c);
        double delta= equation.getDiscriminant();
        double root1= equation.getRoot1();
        double root2= equation.getRoot2();
        if (delta==0){
            System.out.println("Phương trình vô nghiệm");
        }else if (delta==0){
            System.out.println("Phương trình có 1 nghiệm là "+ root1);
        }else{
            System.out.println("Phương trình có 2 nghiệm là "+ root1+ " "+ root2);
        }

    }
}