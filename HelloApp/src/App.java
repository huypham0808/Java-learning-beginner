import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
        Valitdate();
    }
    public static void TestSwitchCase ()
    {
        System.out.println("Hello World");
        System.out.println("Huy Pham");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch(grade){
            case "A" -> "Good";
            case "B" -> "Not Good";
            default -> "Invalid";
        };
        System.out.println("Message is: " + message);
    }
    public static void Valitdate()
    {
        int maxHours = 40;
        System.out.println("How many hours work in this week");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();
        //Validate input
        while(hoursWorked > maxHours)
        {
            System.out.println("Working hours must be from 1 to 40");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        double gross = hoursWorked * 300;
        System.out.println("Payment is: " + gross + "$");
    }
}
