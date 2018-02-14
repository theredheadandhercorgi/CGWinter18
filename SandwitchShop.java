import java.util.Scanner;

public class SandwitchShop {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int numVeggies;
        int numBurgers;
        int numSubs;
        int numSoups;

//----------------------------------------------------------
        System.out.println("Checking sales goals.\n");
//veggie
        System.out.println("The sales goal for veggie sandwiches is 50\n" + "How many veggie sandwiches were sold today?");
        numVeggies = keyboard.nextInt();


        if (numVeggies >= goalForVeggies) {
            System.out.println("Meets Goal");
        }else {
            System.out.println("Fell Short");}

//burgers
        System.out.println("The sales goal for burgers is 250\n" + "How many burgers were sold today? ");
        numBurgers = keyboard.nextInt();
        if (numBurgers >= goalForBurgers) {
            System.out.println("Meets Goal");
        }else {
            System.out.println("Fell Short");}
//subs
        System.out.println("The sales goal for subs is 180\n" + "How many subs were sold today?");
        numSubs = keyboard.nextInt();

        if (numSubs >= goalForSubs) {
            System.out.println("Meets Goal");
        }else {
            System.out.println("Fell Short");}

//soup
        System.out.println("The sales goal for soup is 70\n" + "How many soups were sold today? ");
        numSoups = keyboard.nextInt();

        if (numSoups >= goalForSoup) {
            System.out.println("Meets Goal");
        }else {
            System.out.println("Fell Short");}


        if (numVeggies >= goalForVeggies && numBurgers >= goalForBurgers && numSubs >= goalForSubs && numSoups >= goalForSoup) {
            System.out.println("Meet all Goals today!");
        }else {
            System.out.println("");
        }

    }
}
