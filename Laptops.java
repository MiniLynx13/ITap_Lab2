package Lab2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Laptops  extends Gadgets {
    private LocalTime time;
    private LocalDate date;

    // Конструктор инициализации.
    public Laptops(int battery, String brand, String owner, LocalTime time, LocalDate date) {
        super(battery, brand, owner);
        this.time = time;
        this.date = date;
    }

    // Конструктор по умолчанию.
    public Laptops() {
        this(0, "None", "None", LocalTime.now(), LocalDate.now());
    }

    // Геттер для установленного времени на ноутбуке.
    public LocalTime getTime() {
        return time;
    }

    // Сеттер для установленного времени на ноутбуке.
    public void setTime(LocalTime time) {
        this.time = time;
    }

    // Геттер для установленной даты на ноутбуке.
    public LocalDate getDate() {
        return date;
    }

    // Сеттер для установленной даты на ноутбуке.
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void showTime() {
        System.out.println("Время: " + this.time);
        System.out.println("Дата: " + this.date);
    }

    @Override
    public void checkBattery() {
        System.out.println("Заряд: " + getBattery() + "%");
        System.out.println("Оставшееся время работы: " + getBattery() * 5 + "мин");
    }

    public void search(String query) {
        System.out.println("Ищем в интернете слово: " + query);
    }
}


