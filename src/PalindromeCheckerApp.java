import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] argsg) {
        System.out.println("Enter the number to check the palindrome:");
        int a,j,i;
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while (a != 0) {
            int digit = a%10;
            rev = (rev*10) + digit;
            a = a/10;
        }
        if(a == rev){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }
        System.out.println(a);
    }

}
