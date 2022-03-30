import java.util.Scanner;  // Import the Scanner class

class addition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    int a = sc.nextInt();
int b = sc.nextInt();
int c= a+b;	// Read user input
    System.out.println("Username is: " + c);  // Output user input
  }
}