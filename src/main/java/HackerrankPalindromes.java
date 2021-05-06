import java.util.Locale;
import java.util.Scanner;

public class HackerrankPalindromes {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String A=sc.next();
        A = A.toLowerCase(Locale.ROOT);
        int sLength = A.length();
        boolean flag = true;

        for (int i=0; i < sLength/2 + 1; i++) {
            if (A.charAt(i) == A.charAt(sLength - i - 1)) // Checking the string symbols match one by one
            { flag = flag & true; } // Condition of all the symbols match
            else { flag = false; }
        }

        if (flag == true) {
            System.out.println("Yes");
        }
            else {System.out.println("No");}
    }
}
