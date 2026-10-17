import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String: ");
        String original = scanner.nextLine();

        
        
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();
        
        if(original.equals(reversed)){
            System.out.println("The input string is a palindrome");
        } else{
            System.out.println("The input string is NOT a palindrome");
        }

        scanner.close();
    }
}
