package q75302;

import java.util.Scanner;

interface Appliance {
    void turnOn(String name);
}

interface KitchenAppliance extends Appliance {
    void applianceType(String name);
}

class Microwave implements KitchenAppliance {
    @Override
    public void turnOn(String name) {
        System.out.println(name + " is now ON");
    }

    @Override
    public void applianceType(String name) {
        System.out.println(name + " is a kitchen appliance");
    }
}

public class InteractiveInterfaceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Microwave m = new Microwave();
        m.turnOn(name);
        m.applianceType(name);
        sc.close();
    }
}