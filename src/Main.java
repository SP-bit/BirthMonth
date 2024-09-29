import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";
        System.out.print("Enter your birth month (1-12): ");
        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
            if(!(birthMonth > 0 && birthMonth <= 12))
            {
                System.out.println("Please enter a birth month from 1-12, not " + birthMonth);
            }
            else
            {
                System.out.println("Your birth month is: " + birthMonth);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said your birth month was " + trash);
            System.out.println("Run the program again and answer the prompt");
        }
    }
}
