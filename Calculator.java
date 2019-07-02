package AutoCalc;

import java.util.Scanner;
import static java.lang.System.out;

public class Calculator {
    private Scanner priceScanner = new Scanner(System.in);
    private int carPrice = priceScanner.nextInt();
    private FixedPayments fixedPayments = new FixedPayments();

    public static void main(String[] args) {
        System.out.println("Insert price of your car abroad");
        Calculator calc = new Calculator();
        System.out.println("Total price in Ukraine will be " + calc.totalPriceCalculation());
        System.out.printf("%.2f", calc.totalPriceCalculation());
    }
    private double totalPriceCalculation() {
        double toll = carPrice * 0.1;
        double exciseDuty = 0.0;
        Scanner capacityScanner = new Scanner(System.in);
        out.println("Insert capacity of your vehicle's engine");
        int capacity = capacityScanner.nextInt();

        Scanner ageScanner = new Scanner(System.in);
        out.println("Insert age of your vehicle");
        int age = ageScanner.nextInt();

        out.println("Insert type of fuel (diesel or petrol)");
        Scanner fuelScanner = new Scanner(System.in);
        String fuel = fuelScanner.nextLine();
        if (fuel.equalsIgnoreCase("petrol")) {
            exciseDuty = (50 * age) * capacity / 1000;
        } else if (fuel.equalsIgnoreCase("diesel")) {
            exciseDuty = (75 * age) * capacity / 1000;
        } else out.println("You've insert illegal type of fuel");
        double vat = (carPrice + toll + exciseDuty) * 0.2;
        double pensionFund = carPrice * 0.03;
        return carPrice + toll + exciseDuty + vat + pensionFund + fixedPayments.getFIXED_PAYMENTS();
    }
}



