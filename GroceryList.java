package com.jetbrain;
import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("Please list 3 items for your grocery shopping list.");
        String first;
        out.print("Item 1: ");
        first = keyboard.next();
        keyboard.skip("\n");

        String second;
        out.print("Item 2: ");
        second = keyboard.next();
        keyboard.skip("\n");

        String third;
        out.print("Item 3: ");
        third = keyboard.next();
        keyboard.skip("\n");

        out.println("Now, Please enter the quantity of each item.");
        keyboard.skip("\n");
        int firstQty;
        out.print("How many " + first + "s?");
        firstQty = keyboard.nextInt();
        keyboard.skip("\n");

        int secondQty;
        out.print("How many " + second + "s?");
        secondQty = keyboard.nextInt();
        keyboard.skip("\n");

        int thirdQty;
        out.print("How many " + third + "s?");
        thirdQty = keyboard.nextInt();
        keyboard.skip("\n");

        System.out.println("Now, Please enter the price of each item");

        float firstPrice;
        out.print("How Much does " + first + " cost?");
        firstPrice = keyboard.nextFloat();
        keyboard.skip("\n");

        float secondPrice;
        out.print("How much does " + second + " cost?");
        secondPrice = keyboard.nextFloat();
        keyboard.skip("\n");

        float thirdPrice;
        out.print("How much does " + third + " cost?");
        thirdPrice = keyboard.nextFloat();
        keyboard.skip("\n");

        float total =  (firstQty * firstPrice) + (secondQty * secondPrice) + (thirdQty * thirdPrice);
        out.print("Your total is $" + total);
    }

}




