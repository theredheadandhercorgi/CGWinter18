import java.util.Scanner;


public class SandwitchShop {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

//----------------------------------------------------------
        System.out.println("Checking sales goals.\n");
//veggie
        System.out.println("The sales goal for veggie sandwiches is 50\n" + "How many veggie sandwiches were sold today?");
        goalForVeggies = keyboard.nextInt();

        boolean result1;
        if ((goalForVeggies >= 50)) result1 = true;
        else result1 = false;

        if (result1) {
            System.out.println("Meets Goal");
        }else {
            System.out.println("Fell Short");}

//burgers
        System.out.println("The sales goal for burgers is 250\n" + "How many burgers were sold today? ");
        goalForBurgers = keyboard.nextInt();
        boolean result2;
        if ((goalForBurgers >= 250)) result2 = true;
        else result2 = false;
        if (result2) {
        System.out.println("Meets Goal");
        }else {
        System.out.println("Fell Short");}
//subs
        System.out.println("The sales goal for subs is 180\n" + "How many subs were sold today?");
        goalForSubs = keyboard.nextInt();
        boolean result3;
        if ((goalForSubs >= 180)) result3 = true;
        else result3 = false;
        if (result3) {
        System.out.println("Meets Goal");
        }else {
        System.out.println("Fell Short");}

//soup
        System.out.println("The sales goal for soup is 70\n" + "How many soups were sold today? ");
        goalForSoup = keyboard.nextInt();
        boolean result4;
        if ((goalForSoup >= 70)) result4 = true;
        else result4 = false;
        if (result4) {
        System.out.println("Meets Goal");
        }else {
        System.out.println("Fell Short");}


        if (result1 && result2 && result4 && result3) {
            System.out.println("Meet all Goals today!");
            }else {
            System.out.println("/n");
        }

        }
}
