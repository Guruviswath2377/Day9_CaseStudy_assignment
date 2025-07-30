package config;
import model.Customer;
import model.Restaurant;
import service.FoodOrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.List;
@Configuration
public class AppConfig {
    @Bean
    public Customer customer() {
        return new Customer("Rahul", "rahul@example.com", "Indian");
    }
    @Bean
    public Restaurant restaurant1() {
        return new Restaurant("Spice Garden", "Hyderabad", Arrays.asList("Indian", "Chinese"));
    }
    @Bean
    public Restaurant restaurant2() {
        return new Restaurant("Pasta Palace", "Bangalore", Arrays.asList("Italian", "Continental"));
    }
    @Bean
    public List<Restaurant> restaurantList() {
        return Arrays.asList(restaurant1(), restaurant2());
    }
    @Bean
    public FoodOrderService foodOrderService() {
        return new FoodOrderService(restaurantList());
    }
}