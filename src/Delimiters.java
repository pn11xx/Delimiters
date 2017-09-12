import java.util.Scanner;
public class Delimiters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String num1;
        double sum = 0;
        double average;

        input.useDelimiter(",");

        System.out.println("Enter 10 number separated by a coma \nmaking sure the last number is suceeded by a coma:");
        num1 = input.next();
        sum = sum + Integer.parseInt(num1);//first number
        num1 = input.next();
        sum = sum + Integer.parseInt(num1) ;//second number
        num1 = input.next();
        sum = sum + Integer.parseInt(num1) ;
        num1 = input.next();
        sum = sum + Integer.parseInt(num1) ;
        num1 = input.next();
        sum = sum + Integer.parseInt(num1) ;
        num1 = input.next();
        sum = sum + Integer.parseInt(num1) ;
        num1 = input.next();
        sum = sum + Integer.parseInt(num1) ;
        num1 = input.next();
        sum = sum + Integer.parseInt(num1) ;
        num1 = input.next();
        sum = sum + Integer.parseInt(num1) ;
        num1 = input.next();
        sum = sum + Integer.parseInt(num1) ;

        average = sum/10;//print out average
        System.out.println("The average is:" + average);
    }
}
