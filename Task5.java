import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = scanner.nextInt();

        System.out.print("Enter 3rd number: ");
        int c = scanner.nextInt();
        
        if (a==b && b==c) {
            System.out.println("All numbers are equal");
        } else if(a>b && a>c){
            System.out.println("The largest number is: "+ a);
        } else if(b>a && b>c){
            System.out.println("The largest number is: "+ b);
        } else{
            System.out.println("The largest number is: "+ c);
        }     

        scanner.close();
                

    }
    
}
