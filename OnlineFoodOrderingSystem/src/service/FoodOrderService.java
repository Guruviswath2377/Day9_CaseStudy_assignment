package service;
import model.Customer;
import model.Restaurant;
import java.util.List;
public class FoodOrderService {
    private List<Restaurant> restaurants;
    public FoodOrderService(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
    public void processOrder(Customer customer) {
        String preferredCuisine = customer.getPreferredCuisine();
        System.out.println("Searching for restaurants with cuisine: " + preferredCuisine);
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getAvailableCuisines().contains(preferredCuisine)) {
                System.out.println("Order placed at " + restaurant.getName() +
                        " for " + customer.getName());
                return;
            }
        }
        System.out.println("No restaurant found for cuisine: " + preferredCuisine);
    }
}