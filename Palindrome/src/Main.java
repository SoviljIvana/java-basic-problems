import java.util.Scanner;

public class Main {
  //Palindrome
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        String originalWord;
        String reverseWord="";
        System.out.println("Enter a string to check if it is a palindrome:");
        originalWord = scaner.nextLine();

        int lengthOriginalWord = originalWord.length();

        for (int index =lengthOriginalWord - 1; index >= 0; index--)
            reverseWord = reverseWord + originalWord.charAt(index);

        if (originalWord.equals(reverseWord))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string in not a palindrome.");
    }

}
