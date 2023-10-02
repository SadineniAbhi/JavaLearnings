import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        String userName = scan.nextLine();
                           
        //add new a line before asking next question. 
        System.out.println("Hi "+userName+" ! I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
        String address = scan.nextLine();
                        

        //add new a line before asking next question.
        System.out.println("I hear it's beautiful at "+address+" ! I'm from a place called Oracle");
        System.out.println("How old are you?");
        //Pick up age and store it.
        int age = scan.nextInt();

        //add new a line before asking next question.
        System.out.println("So you're " +age+" , cool! I'm 400 years old.");
        System.out.println("This means I'm "+400/age+" times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        scan.nextLine();
        String language = scan.nextLine();

        //add new a line here.
        System.out.println(language+", that's great! Nice chatting with you "+userName+". I have to log off now. See ya!");
        scan.close();
    }
}
