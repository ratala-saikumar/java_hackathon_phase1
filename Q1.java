import java.util.Scanner;

public class Q1 {

    // Method for calculating total water consumption
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1a) Data Types
        System.out.print("Enter number of family members: ");
        int familyMembers = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        double waterConsumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        int houseNumber = sc.nextInt();

        System.out.print("Enter water usage status (N/H): ");
        char waterStatus = sc.next().charAt(0);

        // Display household details
        System.out.println("\n--- Household Details ---");
        System.out.println("Family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterStatus);

        // 1b) If-Else Condition
        int bill;

        if (waterConsumed <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill = Rs." + bill);

        // 1c) Method
        System.out.print("\nEnter morning water usage: ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total water consumption = " + total + " litres");

        sc.close();
    }
}