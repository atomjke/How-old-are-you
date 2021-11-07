import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Hey, what's your name? ");

        name = input.next();

        System.out.print("Ok, " + name + ", how old are you? ");

        age = input.nextInt();
        
        input.close();

        System.out.println();

        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        }
        if (age < 18) {
            System.out.println("You can't vote, " + name + ".");
        }
        if (age < 25) {
            System.out.println("You can't rent a car, " + name + ".");
        }
        if (age >= 25) {
            System.out.println("You can do anything that's legal, " + name + ".");
        }
    }
}