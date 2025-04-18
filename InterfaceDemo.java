interface Switchable {
    void turnOn();
    void turnOff();

    default void status() {
        System.out.println("Checking status from Switchable interface...");
    }

    static void troubleshoot() {
        System.out.println("Running diagnostics from Switchable interface...");
    }
}

interface VoiceControllable {
    void voiceCommand(String command);
}

class SmartLight implements Switchable {
    private String color;

    SmartLight(String color) {
        this.color = color;
    }

    @Override
    public void turnOn() {
        System.out.println(color + " SmartLight turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(color + " SmartLight turned OFF.");
    }
}

class SmartSpeaker implements Switchable, VoiceControllable {
    private String name;

    SmartSpeaker(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " SmartSpeaker is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " SmartSpeaker is now OFF.");
    }

    @Override
    public void voiceCommand(String command) {
        System.out.println(name + " executing voice command: \"" + command + "\"");
    }
}

interface SmartDevice extends Switchable, VoiceControllable {
    void connectToWiFi(String ssid);
}

class SmartAC implements SmartDevice {
    public void turnOn() {
        System.out.println("SmartAC is ON.");
    }

    public void turnOff() {
        System.out.println("SmartAC is OFF.");
    }

    public void voiceCommand(String command) {
        System.out.println("SmartAC processing voice command: " + command);
    }

    public void connectToWiFi(String ssid) {
        System.out.println("SmartAC connected to WiFi: " + ssid);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Single Interface Implementation ===");
        Switchable light = new SmartLight("Blue");
        light.turnOn();
        light.status(); // default method
        light.turnOff();

        System.out.println("\n=== Multiple Interface Implementation ===");
        SmartSpeaker speaker = new SmartSpeaker("Echo");
        speaker.turnOn();
        speaker.voiceCommand("Play Music");
        speaker.turnOff();

        System.out.println("\n=== Interface Inheritance ===");
        SmartDevice ac = new SmartAC();
        ac.turnOn();
        ac.connectToWiFi("Home_Network");
        ac.voiceCommand("Set temperature to 22°C");
        ac.turnOff();

        System.out.println("\n=== Interface Static Method ===");
        Switchable.troubleshoot(); // accessed through interface name

        System.out.println("\n=== Polymorphism via Interface ===");
        Switchable[] devices = {new SmartLight("Red"), new SmartSpeaker("Nest Mini")};
        for (Switchable d : devices) {
            d.turnOn();
            d.turnOff();
        }
    }
}
