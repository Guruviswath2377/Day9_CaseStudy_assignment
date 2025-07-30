package model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name = "Guru Viswath";
    private String homeId = "HOME123";

    public String getName() {
        return name;
    }

    public String getHomeId() {
        return homeId;
    }

    public void displayUserInfo() {
        System.out.println("User Name: " + name);
        System.out.println("Home ID: " + homeId);
    }
}
