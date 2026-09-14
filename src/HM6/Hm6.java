package HM6;

public class Hm6 {

    public static void main(String[] args) {
        System.out.println("========== ЗАДАНИЕ 1 ==========");
        task1();

        System.out.println("\n========== ЗАДАНИЕ 2 ==========");
        task2();

        System.out.println("\n========== ЗАДАНИЕ 3 ==========");
        task3();

        System.out.println("\n========== ЗАДАНИЕ 4 ==========");
        task4();

        System.out.println("\n========== ЗАДАНИЕ 5 ==========");
        task5();
    }

    /**
     * Задание 1: Определение всех пятниц в месяце и вывод напоминаний об отчете.
     */
    public static void task1() {
        int firstFriday = 3;

        for (int day = 1; day <= 31; day++) {
            if (day >= firstFriday && (day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    /**
     * Задание 2: Трекер дистанции марафона (версии с do-while и for).
     */
    public static void task2() {
        int totalDistance = 42195;

        System.out.println("--- Версия 1: цикл do-while ---");
        int distanceDoWhile = 0;
        do {
            int remaining = totalDistance - distanceDoWhile;
            System.out.println("Держитесь! Осталось " + remaining + " метров");
            distanceDoWhile += 500;
        } while (distanceDoWhile <= totalDistance);

        System.out.println("\n--- Версия 2: цикл for ---");
        for (int distanceFor = 0; distanceFor <= totalDistance; distanceFor += 500) {
            int remaining = totalDistance - distanceFor;
            System.out.println("Держитесь! Осталось " + remaining + " метров");
        }
    }

    /**
     * Задание 3: Калькулятор платной парковки с бесплатным 5-м днем (while и for с continue).
     */
    public static void task3() {
        int initialBudget = 1000;

        System.out.println("--- Версия 1: цикл while ---");
        int budgetWhile = initialBudget;
        int dayWhile = 1;

        while (budgetWhile > 0) {
            if (dayWhile % 5 == 0) {
                dayWhile++;
                continue;
            }
            budgetWhile -= 100;
            dayWhile++;
        }
        int totalDaysWhile = dayWhile - 1;
        System.out.println("Бюджета хватит на " + totalDaysWhile + " дней.");

        System.out.println("\n--- Версия 2: цикл for ---");
        int budgetFor = initialBudget;
        int totalDaysFor = 0;

        for (int day = 1; budgetFor > 0; day++) {
            if (day % 5 == 0) {
                totalDaysFor = day;
                continue;
            }
            budgetFor -= 100;
            totalDaysFor = day;
        }
        System.out.println("Бюджета хватит на " + totalDaysFor + " дней.");
    }

    /**
     * Задание 4: Расчет накопительного счета («вечный» цикл while (true) и break).
     */
    public static void task4() {
        int month = 0;
        double total = 0;
        int target = 12_000_000;

        while (true) {
            month++;
            total += 15000;

            if (month % 6 == 0) {
                total += total * 0.07;
            }

            System.out.printf("Месяц %d, сумма накоплений: %.2f ₽%n", month, total);

            if (total >= target) {
                break;
            }
        }
        System.out.println("Необходимая сумма накоплена за " + month + " месяцев.");
    }

    /**
     * Задание 5: Умная зарядка устройства с контролем перегрева.
     */
    public static void task5() {
        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats <= 3) {
            minute++;

            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев на " + minute + "-й минуте. Всего перегревов: " + overheats);

                if (overheats > 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }

                minute += 2;
                continue;
            }

            charge += 2;
            if (charge >= 100) {
                charge = 100;
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}