import java.util.Scanner;

public class TEMPERATURE_CONVETOR {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");
        unit = scanner.next().toUpperCase();

        if (unit.equals("C")) {
            newTemp = (temp - 32) * 5 / 9;
            System.out.printf("Temperature in Celsius: %.1f°C%n", newTemp);
        }
        else if (unit.equals("F")) {
            newTemp = (temp * 9 / 5) + 32;
             System.out.printf("Temperature in Fahrenheit: %.1f°F%n", newTemp);
        }
        else {
              System.out.println("Invalid unit! Please     enter C or F.");
        }

        scanner.close();
    }
}