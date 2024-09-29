import java.util.Scanner;
public class Main // class Main
{
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;  // birthMonth = 0
        String trash = "";
        System.out.print("Enter your birth month (1-12): "); // output "Enter your birth month: "
        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
            if(!(birthMonth > 0 && birthMonth <= 12)) // if birthMonth < 0 and birthMonth >= 12
            {
                System.out.println("Please enter a birth month from 1-12, not " + birthMonth); //   output "Please enter a birth month from 1-12, not " + birthMonth
            }
            else // else
            {
                System.out.println("Your birth month is: " + birthMonth); //   output "Your birth month is: " + birthMonth
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said your birth month was " + trash);
            System.out.println("Run the program again and answer the prompt");
        } // return
    } // end class
}
