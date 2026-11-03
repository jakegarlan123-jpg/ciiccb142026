import java.util.Scanner;

public class Task7{
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    public static double divide(double num1, double num2){
        return  num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double number2 = scanner.nextDouble();

        double sum = add(number1, number2);
        double difference = subtract(number1, number2);
        double product = multiply(number1, number2);
        double quotient = divide(number1, number2);

        System.out.println("SUM: " + sum);
        System.out.println("DIFFERENCE: " + difference);
        System.out.println("PRODUCT: " + product);
        System.out.println("QUOTIENT: " + quotient);
        scanner.close();
    }
}
