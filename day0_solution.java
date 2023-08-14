import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner sc =new Scanner (System.in);
        System.out.println("Input First number");
        int number1=sc.nextInt(); // first number
        System.out.println("Input second number");
        int number2=sc.nextInt(); //second number
        int answer=number1+number2; // storing addition result in answer variable
        System.out.println("addition result="+answer);



    }
}