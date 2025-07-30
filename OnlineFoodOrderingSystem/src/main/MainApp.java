package main;
import config.AppConfig;
import model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.FoodOrderService;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Customer customer = context.getBean(Customer.class);
        FoodOrderService foodOrderService = context.getBean(FoodOrderService.class);
        foodOrderService.processOrder(customer);
    }
}