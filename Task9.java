import static java.lang.Math.*;

public class Task9{
    public static int add(int a, int b){
        return Math.addExact(a,b); 
    }
    public static int subtract (int a, int b){
        return Math.subtractExact(a, b);
    }
    public static int multiply(int a, int b){
        return Math.multiplyExact(a, b);
    }
    public static float divide(int a, int b){
        return Math.floorDiv(a, b);
    };
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 5;

        System.out.println("Addition ("+ num1 + "+"+ num2 + "):" + add(num1, num2));
        System.out.println("Subtraction ("+ num1 +"-" + num2 + "):" + subtract(num1, num2));
        System.out.println("Multiplication ("+ num1 + " * " + num2 + "):" + multiply(num1, num2));
        System.out.println("Division ("+ num1 + "/"+ num2 +"):" + divide(num1, num2));
    }
}
