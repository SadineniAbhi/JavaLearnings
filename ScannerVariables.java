import java.util.Scanner;
public class ScannerVariables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");

        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();


        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you <name> for answering all <counter> questions");
        System.out.println("Weekly, you spend $<totalPrice> on coffee");
        System.out.println("Weekly, you spend $<totalPrice> on food");

    }
}
