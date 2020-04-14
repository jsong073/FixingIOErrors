import java.util.Scanner;

public class FixingIOErrors {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();

        System.out.println("Summary: " + "Your name is: " + name + "\n" +
                "Your age is: " + age + "\n" +
                "Your year of birth is: " + yearOfBirth);
    }
}
