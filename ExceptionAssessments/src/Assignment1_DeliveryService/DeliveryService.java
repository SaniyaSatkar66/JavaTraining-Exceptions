package Assignment1_DeliveryService;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeliveryService {
    private static Set<String> citySet = new HashSet<>();

    public static void addCity(String city) throws DuplicateCityException {
        if (!citySet.add(city)) {
            throw new DuplicateCityException(city);
        }
        System.out.println("City added: " + city);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter city name (or 'exit' to quit): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            try {
                addCity(input);
            } catch (DuplicateCityException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Final delivery list: " + citySet);
    }
}
