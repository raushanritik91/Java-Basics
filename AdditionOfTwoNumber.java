import java.util.Scanner;

class AdditionOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();  // Read first number
        int b = sc.nextInt();  // Read second number
        int addition = a + b;  // Perform addition

        System.out.println("Addition: " + addition);
        sc.close();
    }
}
