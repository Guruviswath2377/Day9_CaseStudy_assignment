package model;

import org.springframework.stereotype.Component;

@Component
public class Device {
    private String deviceType = "AC";
    private boolean status = false;

    public void turnOn() {
        status = true;
        System.out.println(deviceType + " is now ON.");
    }

    public void turnOff() {
        status = false;
        System.out.println(deviceType + " is now OFF.");
    }

    public String getDeviceType() {
        return deviceType;
    }

    public boolean isStatus() {
        return status;
    }
}
