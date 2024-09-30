package Lab2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Smartphones extends Gadgets  {
    private LocalTime time;
    private LocalDate date;

    // Конструктор инициализации.
    public Smartphones(int battery, String brand, String owner, LocalTime time, LocalDate date) {
        super(battery, brand, owner);
        this.time = time;
        this.date = date;
    }

    // Конструктор по умолчанию.
    public Smartphones() {
        this(0, "None", "None", LocalTime.now(), LocalDate.now());
    }

    // Геттер для установленного времени на смартфоне.
    public LocalTime getTime() {
        return time;
    }

    // Сеттер для установленного времени на смартфоне.
    public void setTime(LocalTime time) {
        this.time = time;
    }

    // Геттер для установленной даты на смартфоне.
    public LocalDate getDate() {
        return date;
    }

    // Сеттер для установленной даты на смартфоне.
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void showTime() {
        System.out.println(this.time);
        System.out.println(this.date);
    }

    @Override
    public void checkBattery() {
        System.out.println("Заряд: " + getBattery() + "%");
    }

    public void call(String number) {
        System.out.println("Звоним абоненту " + number);
    }
}


