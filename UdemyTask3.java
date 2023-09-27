import java.util.Scanner;
public class UdemyTask3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your deteails");

        String firstName = scan.nextLine();
        String lastName = scan.nextLine();

        int age = scan.nextInt();
        scan.nextLine();
        String userName = scan.nextLine();

        scan.close();
        System.out.println("your name is "+firstName+lastName+" and your age is "+age+ "and your username is "+userName);
    }
}
