import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args [])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Tables");

        int number;
        int multiple;
        System.out.print(" How large would you like to go?");
        int numberMax;
                numberMax = keyboard.nextInt();

        for (number = 0; number <= numberMax; number++)

        {
            for (multiple = 0; multiple <= 5; multiple++)
            {
            System.out.println( number + "*" + multiple + " = " + (number*multiple));}
    }
}
}