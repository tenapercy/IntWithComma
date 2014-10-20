import java.util.Scanner;
/**
 * Uses Recursion to convert an Integer into a nicely formatted, readable string with appropriate commas.
 * 
 * @author Tena Percy 
 * 
 */
public class Comma
{
    public static void main() 
    {
        Scanner conIn = new Scanner(System.in);
        Long input = null;
        String more = null;

        do {
            //Get the number to be evaluated
            System.out.println("Input a number: ");
            input = conIn.nextLong();
            more = conIn.nextLine();
            System.out.println("Result: " + intWithComma(input));

            //Determine if there is another number to evaluate
            System.out.println();
            System.out.println("Evaluate another number? (Y=Yes): ");
            more = conIn.nextLine();
            if (!more.equalsIgnoreCase("y")) {
                System.out.println("Program Finished.");
            }
            System.out.println();

        } while (more.equalsIgnoreCase("y"));
    }

    private static String intWithComma(long n)
    //recursively inputs commas in appropriate positions in a given number
    {
        if (n < 0 ) {
            return ("-" + intWithComma(-n));
        } else if ((n >= 0) && (n < 1000)) {
            return n + "";
        } else {
            if (n%1000 < 10) {
                return (intWithComma(n/1000) + ",00" + intWithComma(n%1000));
            } else if (n%1000 < 100) {
                return (intWithComma(n/1000) + ",0" + intWithComma(n%1000));
            } else {
                return (intWithComma(n/1000) + "," + intWithComma(n%1000));
            }
        }

    }

}

