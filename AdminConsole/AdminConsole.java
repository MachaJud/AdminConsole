import java.util.Scanner;

public class AdminConsole {
    public static void main(String[] args) {
        // Define the correct username and password
        String correctUsername = "Admin";
        String correctPassword = "password@123";

        // Maximum number of login attempts
        int maxAttempts = 3;
        int attempts = 0;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            // Prompt the user to enter a username
            System.out.print("Enter your username: ");
            String enteredUsername = scanner.nextLine();

            // Prompt the user to enter a password (input is hidden)
            System.out.print("Enter your password: ");
            String enteredPassword = scanner.nextLine();

            // Check if the entered username and password match the correct ones
            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                System.out.println("Login successful. Welcome, " + correctUsername + "!");
                break; // Exit the loop if login is successful
            } else {
                System.out.println("Login failed. Please check your username and password.");
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("Remaining attempts: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Maximum login attempts reached. Account locked.");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
