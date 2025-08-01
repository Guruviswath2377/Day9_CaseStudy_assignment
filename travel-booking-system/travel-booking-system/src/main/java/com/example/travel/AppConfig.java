package com.example.travel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean
    public FlightBooking flightBooking() {
        return new FlightBooking();
    }
    @Bean
    public TrainBooking trainBooking() {
        return new TrainBooking();
    }
    @Bean
    public TravelBookingService travelBookingService(FlightBooking flightBooking, TrainBooking trainBooking) {
        return new TravelBookingService(flightBooking, trainBooking);
    }
}