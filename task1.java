import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a temperature value: ");
        double temperature = input.nextDouble();

        System.out.println(
                "Please enter the original unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        String unit = input.next();

        double convertedTemp = 0;

        switch (unit.toUpperCase()) {
            case "C":
                convertedTemp = convertCelsiusToFahrenheit(temperature);
                System.out.println(temperature + " Celsius is " + convertedTemp + " Fahrenheit");
                convertedTemp = convertCelsiusToKelvin(temperature);
                System.out.println(temperature + " Celsius is " + convertedTemp + " Kelvin");
                break;
            case "F":
                convertedTemp = convertFahrenheitToCelsius(temperature);
                System.out.println(temperature + " Fahrenheit is " + convertedTemp + " Celsius");
                convertedTemp = convertFahrenheitToKelvin(temperature);
                System.out.println(temperature + " Fahrenheit is " + convertedTemp + " Kelvin");
                break;
            case "K":
                convertedTemp = convertKelvinToCelsius(temperature);
                System.out.println(temperature + " Kelvin is " + convertedTemp + " Celsius");
                convertedTemp = convertKelvinToFahrenheit(temperature);
                System.out.println(temperature + " Kelvin is " + convertedTemp + " Fahrenheit");
                break;
            default:
                System.out.println("Invalid input. Please try again.");
        }

        input.close();
    }

    private static double convertCelsiusToFahrenheit(double temperature) {
        return 0;
    }

    private static double convertKelvinToCelsius(double temperature) {
        return 0;
    }

    private static double convertKelvinToFahrenheit(double temperature) {
        return 0;
    }

    private static double convertFahrenheitToKelvin(double temperature) {
        return 0;
    }

    private static double convertFahrenheitToCelsius(double temperature) {
        return 0;
    }

    private static double convertCelsiusToKelvin(double temperature) {
        return 0;
    }
}
