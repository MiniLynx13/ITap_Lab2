package Lab2;

import java.util.Scanner;

public class GadgetsWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gadgets clock = new Clocks();
        Gadgets phone = new Smartphones();
        Gadgets laptop = new Laptops();

        System.out.println("Зарегистрировано гаджетов: " + Gadgets.getGadgetsCounter());

        System.out.println("Часы:");
        showGadgetTime(clock);
        checkGadgetBattery(clock);

        System.out.println("Смартфон:");
        showGadgetTime(phone);
        checkGadgetBattery(phone);

        System.out.println("Ноутбук:");
        showGadgetTime(laptop);
        checkGadgetBattery(laptop);

        String number = scanner.next();
        callUser(number, (Smartphones) phone);

        String query = scanner.next();
        SearchQuery(query, (Laptops) laptop);
    }

    public static void showGadgetTime(Gadgets gadget) {
        gadget.showTime();
    }

    public static void checkGadgetBattery(Gadgets gadget) {
        gadget.checkBattery();
    }

    public static void callUser(String number, Smartphones phone) {
        phone.call(number);
    }

    public static void SearchQuery(String query, Laptops laptop) {
        laptop.search(query);
    }
}


