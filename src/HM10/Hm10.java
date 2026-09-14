package HM10;

import java.time.LocalDate;

public class Hm10 {

    // task 1
    public static void printLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Task 2
    public static void suggestAppVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = (osType == 0) ? "iOS" : "Android";
        String version = (clientDeviceYear < currentYear) ? "облегченную" : "обычную";

        System.out.println("Установите " + version + " версию приложения для " + osName + " по ссылке");
    }

    // task 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 0 || deliveryDistance > 100) {
            return -1; // Доставки нет
        }
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        return days;
    }

    public static void main(String[] args) {
        // task 1 to complete
        printLeapYear(2024);

        // task 2 to complete
        suggestAppVersion(0, 2022);

        // task 3 to complete
        int distance = 95;
        int days = calculateDeliveryDays(distance);
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
}