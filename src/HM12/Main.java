package HM12;

public class Main {
    public static void main(String[] args) {
        //Создание и тестирование товаров
        System.out.println("--- ТОВАРЫ ---");
        Product product1 = new Product(101, "Смартфон", 50000, "Электроника");
        Product product2 = new Product(101, "Смартфон Pro", 75000, "Электроника");
        Product product3 = new Product(202, "Ноутбук", 120000, "Компьютеры");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println("product1 равен product2: " + product1.equals(product2));
        System.out.println("product1 равен product3: " + product1.equals(product3));
        System.out.println("product2 равен product3: " + product2.equals(product3));

        //Создание и тестирование заказов
        System.out.println("\n--- ЗАКАЗЫ ---");
        Product[] basket1 = {product1, product3};
        Product[] basket2 = {product2, product3};
        Product[] basket3 = {product3, product1};

        Order order1 = new Order("Алексей", basket1);
        Order order2 = new Order("Алексей", basket2);
        Order order3 = new Order("Алексей", basket3);
        Order order4 = new Order("Дмитрий", basket1);

        System.out.println("Заказ 1: " + order1);
        System.out.println("Заказ 2: " + order2);
        System.out.println("Заказ 3: " + order3);
        System.out.println("Заказ 4: " + order4);

        System.out.println("order1 равен order2: " + order1.equals(order2));
        System.out.println("order1 равен order3: " + order1.equals(order3));
        System.out.println("order1 равен order4: " + order1.equals(order4));
    }
}