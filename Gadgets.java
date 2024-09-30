package Lab2;

public abstract class Gadgets {
    private int battery;
    private String brand;
    private String owner;
    private static int gadgetsCounter;

    // Конструктор инициализации.
    public Gadgets (int battery, String brand, String owner) {
        if ((battery >= 0) & (battery <= 100)) {
            this.battery = battery;
        } else {
            this.battery = 0;
        }
        this.brand = brand;
        this.owner = owner;
        gadgetsCounter++;
    }

    // Конструктор по умолчанию.
    public Gadgets () {
        this(0, "None", "None");
        gadgetsCounter++;
    }

    public static int getGadgetsCounter() {
        return gadgetsCounter;
    }

    public static void setGadgetsCounter(int gadgetsCounter) {
        Gadgets.gadgetsCounter = gadgetsCounter;
    }

    // Геттер для уровня заряда батареи гаджета.
    public int getBattery() {
        return battery;
    }

    // Сеттер для уровня заряда батареи гаджета.
    public void setBattery(int battery) {
        if ((battery >= 0) & (battery <= 100)) {
            this.battery = battery;
        } else {
            this.battery = 0;
        }
    }

    // Геттер для названия производителя гаджета.
    public String getBrand() {
        return brand;
    }

    // Сеттер для производителя гаджета.
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Геттер для имени владельца гаджета.
    public String getOwner() {
        return owner;
    }

    // Сеттер для имени владельца гаджета.
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public abstract void showTime();

    public void checkBattery() {
        System.out.println(battery + "%");
    }
}


