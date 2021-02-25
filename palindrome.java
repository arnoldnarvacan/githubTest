import java.util.*;
public class palindrome {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    String original, reverse; 
    char ch=' ';
    Scanner input = new Scanner(System.in);
        while(ch != 'n'){
            System.out.print("Enter a word : ");
            original = input.next();
            reverse = new StringBuilder(original).reverse().toString();

            if(reverse.equals(original))
                System.out.println("Original : "+original+"\nReversed : "+reverse+"\nIt is a Palindrome");
            else
            System.out.println("Original : "+original+"\nReversed : "+reverse+"\nIt is not a Palindrome");

            System.out.println("Do you want to continue? y/n >> ");
                ch = input.next().charAt(0);
        }
        System.out.println("You exited the system.");
    }
}
