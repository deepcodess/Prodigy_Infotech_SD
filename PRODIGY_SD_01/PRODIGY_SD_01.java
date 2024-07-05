import java.util.Scanner;

public class PRODIGY_SD_01 {
    public static void convertion(double temp, char unit) {
        double celsius, fahrenheit, kelvin;

        // To Celsius
        switch (unit) {
            case 'F':
                celsius = (temp - 32) * 5 / 9;
                break;
            case 'K':
                celsius = temp - 273.15;
                break;
            default:
                celsius = temp;
        }

        // Celsius to Fahrenheit
        fahrenheit = (celsius * 9 / 5) + 32;

        // Celsius to Kelvin
        kelvin = celsius + 273.15;

        System.out.println("Temperature Converted:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temp value: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().charAt(0);

        convertion(temp, unit);

        scanner.close();
    }
}