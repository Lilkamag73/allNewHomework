package HM8;

import java.util.Arrays;

public class Hm8 {

    public static void main(String[] args) {
        System.out.println("========== ЗАДАЧА 1 ==========");
        task1();

        System.out.println("\n========== ЗАДАЧА 2 ==========");
        task2();

        System.out.println("\n========== ЗАДАЧА 3 ==========");
        task3();

        System.out.println("\n========== ЗАДАЧА 4 ==========");
        task4();

        System.out.println("\n========== ЗАДАЧА 5 ==========");
        task5();
    }

    /**
     * Задача 1: Расчет суммы, максимума, минимума и среднего значения выплат.
     */
    public static void task1() {
        int[] inputArray1 = {12000, 45000, 23000, 8000, 31000};

        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];

        // Поиск суммы, максимума и минимума через цикл for-each
        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }

        // Вычисление среднего значения с точностью float
        float average = (float) sum / inputArray1.length;

        // Результирующий массив: [сумма, максимум, минимум, среднее]
        float[] outputArray1 = {sum, max, min, average};

        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1 [сумма, максимум, минимум, среднее]: " + Arrays.toString(outputArray1));
    }

    /**
     * Задача 2: Расчет налога 13% для каждой выплаты.
     */
    public static void task2() {
        int[] inputArray2 = {50000, 80000, 120000, 45000, 95000};
        float[] outputArray2 = new float[inputArray2.length];

        int index = 0;
        for (int salary : inputArray2) {
            outputArray2[index] = salary * 0.13f;
            index++;
        }

        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2 (налог 13%): " + Arrays.toString(outputArray2));
    }

    /**
     * Задача 3: Поиск бонусов выше 5000 ₽ (массив булевых флагов).
     */
    public static void task3() {
        int[] inputArray3 = {3000, 7500, 5000, 12000, 4800};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        int index = 0;
        for (int bonus : inputArray3) {
            outputArray3[index] = bonus > 5000;
            index++;
        }

        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3 (бонус > 5000): " + Arrays.toString(outputArray3));
    }

    /**
     * Задача 4: Проверка кредитной истории на отсутствие отрицательного баланса (быстрый выход через break).
     */
    public static void task4() {
        int[] inputArray4 = {15000, 2300, -500, 8000, 12000};
        boolean hasNoOverdue = true;

        for (int balance : inputArray4) {
            if (balance < 0) {
                hasNoOverdue = false;
                break; // Прерываем проверку при первом обнаруженном отрицательном балансе
            }
        }

        // Результат упаковывается в массив из одного элемента
        boolean[] outputArray4 = {hasNoOverdue};

        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4 (нет просрочек): " + Arrays.toString(outputArray4));
    }

    /**
     * Задача 5: Подсчет количества прибыльных месяцев (прибыль > 0).
     */
    public static void task5() {
        int[] inputArray5 = {120000, -35000, 450000, 0, -15000};
        int profitableMonths = 0;

        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonths++;
            }
        }

        // Результат упаковывается в массив из одного элемента
        int[] outputArray5 = {profitableMonths};

        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5 (кол-во прибыльных месяцев): " + Arrays.toString(outputArray5));
    }
}