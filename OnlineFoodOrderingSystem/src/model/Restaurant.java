package model;
import java.util.List;
public class Restaurant {
    private String name;
    private String location;
    private List<String> availableCuisines;
    public Restaurant(String name, String location, List<String> availableCuisines) {
        this.name = name;
        this.location = location;
        this.availableCuisines = availableCuisines;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public List<String> getAvailableCuisines() {
        return availableCuisines;
    }
}