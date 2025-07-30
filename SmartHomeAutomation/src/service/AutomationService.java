package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Device;
import model.User;

@Service
public class AutomationService {

    @Autowired
    private User user;

    @Autowired
    private Device device;

    public void controlDevice() {
        user.displayUserInfo();
        System.out.println("Controlling Device: " + device.getDeviceType());
        device.turnOn();
        device.turnOff();
    }
}
