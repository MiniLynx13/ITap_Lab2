package Lab2;

import java.time.LocalTime;

public class Clocks extends Gadgets {
    private LocalTime time;

    // Конструктор инициализации.
    public Clocks(int battery, String brand, String owner, LocalTime time) {
        super(battery, brand, owner);
        this.time = time;
    }

    // Конструктор по умолчанию.
    public Clocks() {
        this(0, "None", "None", LocalTime.now());
    }

    // Геттер для установленного времени на часах.
    public LocalTime getTime() {
        return time;
    }

    // Сеттер для установленного времени на часах.
    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void showTime() {
        System.out.println(this.time);
    }
}


