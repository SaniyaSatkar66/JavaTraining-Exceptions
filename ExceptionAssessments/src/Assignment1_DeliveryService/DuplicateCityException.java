package Assignment1_DeliveryService;

public class DuplicateCityException extends Exception {
    public DuplicateCityException(String city) {
        super("City already in delivery list: " + city);
    }
}
