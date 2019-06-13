import java.util.Scanner;

public class UsingSubstringLengthCharAtAssignment {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);



                System.out.println("Please enter a word: ");
                String word = kb.nextLine();
                int stringLength = word.length();

                System.out.println("Please enter a character numder index: ");
                int index = kb.nextInt();
                String substring = word.substring(0, index);

                    if (index < stringLength) {
                        System.out.println("The length of " + word + " is: " + stringLength);
                        System.out.println("The substring from 0 to " + index + " is: " + substring);
                    } else
                        System.out.println("Index is larger than length");




    }
}
